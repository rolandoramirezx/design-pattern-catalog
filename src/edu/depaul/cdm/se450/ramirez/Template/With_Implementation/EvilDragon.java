package edu.depaul.cdm.se450.ramirez.Template.With_Implementation;

public class EvilDragon {

    int healthPoints = 100;

    public int deductHealthPoints(int pointDeduction){
        this.healthPoints = (this.healthPoints - pointDeduction);
        if (this.healthPoints == 0){
            System.out.println("--YOU'VE DEFEATED THE DRAGON--\n");
        }
        return  this.healthPoints;
    }
}
