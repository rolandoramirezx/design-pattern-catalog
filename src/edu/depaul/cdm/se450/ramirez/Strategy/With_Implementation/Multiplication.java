package edu.depaul.cdm.se450.ramirez.Strategy.With_Implementation;

public class Multiplication implements Computation {

    @Override
    public void compute(int variableOne, int variableTwo) {

        int product = (variableOne * variableTwo);
        System.out.printf("%d x %d = %d\n", variableOne, variableTwo, product);

    }
}
