package edu.depaul.cdm.se450.ramirez.Strategy.Without_Implementation;

public class Main {

    public static void main (String[] args){

        Computation additionProblem = new Computation();
        System.out.println("1 + 2 = " + additionProblem.additionComputation(1,2));

        Computation multiplicationProblem = new Computation();
        System.out.println("6 * 6 = " + multiplicationProblem.multiplicationComputation(1,2));

        Computation divisionProblem = new Computation();
        System.out.println("4 / 2 = " + divisionProblem.divisionComputation(4,2));

    }
}
