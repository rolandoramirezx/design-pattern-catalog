package edu.depaul.cdm.se450.ramirez.Strategy.With_Implementation;

public class Main {

    public static void main (String[] args){

        Calculation additionProblem = new Calculation();
        additionProblem.setComputation(new Addition());
        additionProblem.compute(1,2);

        Calculation multiplicationProblem = new Calculation();
        multiplicationProblem.setComputation(new Multiplication());
        multiplicationProblem.compute(6,6);

        Calculation divisionProblem = new Calculation();
        divisionProblem.setComputation(new Division());
        divisionProblem.compute(4,2);

    }

}
