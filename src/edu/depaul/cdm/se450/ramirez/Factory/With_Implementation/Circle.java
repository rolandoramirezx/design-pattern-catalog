package edu.depaul.cdm.se450.ramirez.Factory.With_Implementation;

public class Circle extends Shape {

    public Circle(int perimeter){

        String name = "circle";
        System.out.println("You've created a " + name + " with a perimeter of " + perimeter);
        System.out.println();
    }
}
