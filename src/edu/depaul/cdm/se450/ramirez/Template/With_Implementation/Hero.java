package edu.depaul.cdm.se450.ramirez.Template.With_Implementation;

import java.util.Scanner;

public abstract class Hero {

    String name;
    EvilDragon evilDragon;

    //template
    final void prepareForCombat(){
        drawWeapon();
        confirmReady();
        attack();
        promptNextMove();
    }

    abstract void drawWeapon();

    public void confirmReady(){
        System.out.println( name + ": I am ready for combat!\n");
    }

    abstract void attack();

    public void promptNextMove(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like " + name + " to attack again? (y or n)");
        String answer = scanner.next();
        if (answer.equals("y")){
            attack();
            promptNextMove();
        } else if (answer.equals("n"))
            System.out.println(name + " ends his/her move...\n");
        }


    public void setName(String name){
        this.name = name;
    }


    public void setTarget(EvilDragon evilDragon){
        this.evilDragon = evilDragon;
    }
}
