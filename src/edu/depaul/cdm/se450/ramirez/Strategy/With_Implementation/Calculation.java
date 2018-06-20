package edu.depaul.cdm.se450.ramirez.Strategy.With_Implementation;

public class Calculation {

    Computation computationType;

    public void setComputation(Computation computationType){
        this.computationType = computationType;
    }

    public void compute(int variableOne, int variableTwo){
        computationType.compute(variableOne, variableTwo);
    }

}
