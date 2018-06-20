package edu.depaul.cdm.se450.ramirez.Factory.With_Implementation;

import java.util.Scanner;

public class ShapeFactory3D extends ShapeFactory {

    public Shape createShape() {

        System.out.println("Please enter shape type, sphere or pyramid:");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        if (type.equals("sphere")) {

            System.out.println("Okay, now chose the radius of your sphere:");
            int radius = scanner.nextInt();

            return new Sphere(radius);

        } else if (type.equals("pyramid")) {

            System.out.println("Okay, now chose the length of your pyramid:");
            int length = scanner.nextInt();
            System.out.println("Okay, now chose the width of your pyramid:");
            int width = scanner.nextInt();
            System.out.println("Okay, now chose the height of your pyramid:");
            int height = scanner.nextInt();
            return new Pyramid(length, width, height);

        } else return null;
    }
}
