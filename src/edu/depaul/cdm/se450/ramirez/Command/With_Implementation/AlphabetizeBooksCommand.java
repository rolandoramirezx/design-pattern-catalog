package edu.depaul.cdm.se450.ramirez.Command.With_Implementation;

public class AlphabetizeBooksCommand implements Command {

   Droid droid;

   public AlphabetizeBooksCommand (Droid droid){
       this.droid = droid;
   }

    @Override
    public void execute() {
        droid.alphabetizeBooks();
    }
}
