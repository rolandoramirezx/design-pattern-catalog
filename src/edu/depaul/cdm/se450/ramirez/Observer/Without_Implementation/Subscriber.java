package edu.depaul.cdm.se450.ramirez.Observer.Without_Implementation;

public class Subscriber {

    boolean notified;

    public void announceNewRelease(boolean notified){
        this.notified = notified;
    }

    public void confirmNotification(){

        if (this.notified == true){
            System.out.println("Your subscribers have been notified of the new release.");

        } else {
            System.out.print("A new album has not been announced, so your subscribers have not been contacted.");
        }
    }
}
