package edu.depaul.cdm.se450.ramirez.Factory.With_Implementation;

import java.util.Scanner;

public class ShapeFactory2D extends ShapeFactory {

    public Shape createShape() {

        System.out.println("Please enter shape type, circle or triangle:");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();

        if (type.equals("triangle")) {

            System.out.println("Okay, now chose the size of your base:");
            int base = scanner.nextInt();

            System.out.println("Okay, now chose the height of your triangle:");
            int height = scanner.nextInt();

            return new Triangle(base, height);

        } else if (type.equals("circle")) {

            System.out.println("Okay, now chose the size of your perimeter:");
            int perimeter = scanner.nextInt();

            return new Circle(perimeter);

        } else return null;
    }
}
