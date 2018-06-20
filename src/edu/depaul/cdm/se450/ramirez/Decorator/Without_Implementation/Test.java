package edu.depaul.cdm.se450.ramirez.Decorator.Without_Implementation;

public class Test {

    public double totalPoints;

    public double deductPoints(double pointsDeduction){
        this.totalPoints = (totalPoints - pointsDeduction);
        return totalPoints;
    }

    public double applyCurve(double curve){
        this.totalPoints = (totalPoints + curve);
        return totalPoints;
    }

    public double getTotalPoints(){
        return totalPoints;
    }

    //pending test type (i.e Exam or Test), totalPoints will be set to 100.0 to 10.0 using method below

    public double setTotalPoints(double totalPoints){
        this.totalPoints = totalPoints;
        return totalPoints;
    }
}
