package edu.depaul.cdm.se450.ramirez.Factory.With_Implementation;

public class Main {

    public static void main(String[] args){

        ShapeFactory shapeFactory2D = new ShapeFactory2D();
        ShapeFactory shapeFactory3D = new ShapeFactory3D();

        System.out.println("Creating triangle...");
        Shape triangle = shapeFactory2D.createShape();

        System.out.println("Creating circle...");
        Shape circle = shapeFactory2D.createShape();

        System.out.println("Creating sphere...");
        Shape sphere = shapeFactory3D.createShape();

        System.out.println("Creating pyramid...");
        Shape pyramid = shapeFactory3D.createShape();

    }
}
