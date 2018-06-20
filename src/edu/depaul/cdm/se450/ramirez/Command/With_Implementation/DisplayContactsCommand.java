package edu.depaul.cdm.se450.ramirez.Command.With_Implementation;

public class DisplayContactsCommand implements Command {

    Droid droid;

    public DisplayContactsCommand(Droid droid) {
        this.droid = droid;
    }

    @Override
    public void execute() {
        droid.dispayContacts();
    }

}
