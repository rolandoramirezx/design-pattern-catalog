package edu.depaul.cdm.se450.ramirez.Template.With_Implementation;

public class Knight extends Hero {

    @Override
    void drawWeapon() {
        System.out.println(super.name + " has drawn his/her sword!\n");

    }

    @Override
    void attack() {
        System.out.println(super.name + " swings his/her sword...\n");
        evilDragon.deductHealthPoints(10);
        System.out.println("The dragon's remaining health is " + evilDragon.healthPoints + "...\n");
    }
}
