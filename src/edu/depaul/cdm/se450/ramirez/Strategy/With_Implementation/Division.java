package edu.depaul.cdm.se450.ramirez.Strategy.With_Implementation;

public class Division implements Computation {


    @Override
    public void compute(int variableOne, int variableTwo) {

        int quotient = (variableOne / variableTwo);
        System.out.printf("%d / %d = %d\n", variableOne, variableTwo, quotient);
    }
}
