package edu.depaul.cdm.se450.ramirez.Command.With_Implementation;

public class Main {

    public static void main(String[] args) {

        Jedi lukeSkywalker = new Jedi();

        Droid r2d2 = new Droid();
        r2d2.setName("r2d2");

        Command displayContacts = new DisplayContactsCommand(r2d2);
        Command alphabetizeBooks = new AlphabetizeBooksCommand(r2d2);

        //books for the Droid to alphabetize
        r2d2.books[0]=("The Great Gatsby");
        r2d2.books[1]=("Headfirst: Design Patterns");
        r2d2.books[2]=("Moby Dick");

        //contacts for the Droid to display
        r2d2.contacts.put("Mace Windu", "Tattooine");
        r2d2.contacts.put("Rey", "Jakku");

        lukeSkywalker.commands.add(displayContacts);
        lukeSkywalker.commands.add(alphabetizeBooks);

        for(Command command:lukeSkywalker.commands){
            command.execute();
            System.out.println();
        }

    }
}
