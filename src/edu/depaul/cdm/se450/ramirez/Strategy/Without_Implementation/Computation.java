package edu.depaul.cdm.se450.ramirez.Strategy.Without_Implementation;

public class Computation {

    public int additionComputation (int variableOne, int variableTwo) {

        int sum = (variableOne + variableTwo);
        return sum;
    }

    public int multiplicationComputation (int variableOne, int variableTwo){

        int product = (variableOne * variableTwo);
        return product;
    }

    public int divisionComputation (int variableOne, int variableTwo){

        int quotient = (variableOne / variableTwo);
        return quotient;
    }
}
