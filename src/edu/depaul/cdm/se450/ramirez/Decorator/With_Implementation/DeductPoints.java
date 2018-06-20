package edu.depaul.cdm.se450.ramirez.Decorator.With_Implementation;

//this is a concrete decorator

public class DeductPoints extends Test {

    Test test;
    Double pointDeduction;

    public DeductPoints(Test test, double pointDeduction ){
        this.test = test;
        this.pointDeduction = pointDeduction;
    }

    public double totalPoints(){
        return (test.totalPoints() - pointDeduction);
    }
}
