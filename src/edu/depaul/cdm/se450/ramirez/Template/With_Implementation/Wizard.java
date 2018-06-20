package edu.depaul.cdm.se450.ramirez.Template.With_Implementation;

public class Wizard extends Hero {

    @Override
    void drawWeapon() {
        System.out.println(super.name + " has drawn his/her wand!\n");
    }

    @Override
    void attack() {
        System.out.println(super.name + " casts a spell...\n");
        evilDragon.deductHealthPoints(10);
        System.out.println("The dragon's remaining health is " + evilDragon.healthPoints + "...\n");
    }
}
