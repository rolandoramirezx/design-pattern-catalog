package edu.depaul.cdm.se450.ramirez.Decorator.With_Implementation;

//this is a concrete decorator

public class Curve extends Test {

    Test test;
    Double curve;

    public Curve(Test test, double curve ){
        this.test = test;
        this.curve = curve;
    }

    public double totalPoints(){
        return (test.totalPoints() + curve);
    }

}
