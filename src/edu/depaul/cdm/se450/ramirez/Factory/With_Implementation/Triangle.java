package edu.depaul.cdm.se450.ramirez.Factory.With_Implementation;

public class Triangle extends Shape {


    public Triangle(int base, int height){

        String name = "triangle";
        System.out.println("You've created a " + name + " with base/height ratio of " + base + "/" + height);
        System.out.println();
    }

}
