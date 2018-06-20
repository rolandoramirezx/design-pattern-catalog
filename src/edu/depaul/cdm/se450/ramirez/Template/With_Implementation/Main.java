package edu.depaul.cdm.se450.ramirez.Template.With_Implementation;

public class Main {

    public static void main(String[]args){

        System.out.println("Narrator: An evil dragon appears before the traveling heroes...\n");

        Knight kingArthur = new Knight();
        Wizard merlin = new Wizard();
        EvilDragon evilDragon = new EvilDragon();

        kingArthur.setName("King Arthur");
        kingArthur.setTarget(evilDragon);
        kingArthur.prepareForCombat();

        merlin.setName("Merlin");
        merlin.setTarget(evilDragon);
        merlin.prepareForCombat();

    }
}
