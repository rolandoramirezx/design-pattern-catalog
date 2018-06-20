package edu.depaul.cdm.se450.ramirez.Observer.Without_Implementation;

public class Main {

    public static void main(String[] args){

        Fans fans = new Fans();

        fans.fanList.add("John.Doe@gmail.com");
        fans.fanList.add("Jane.Doe@gmail.com");

        fans.announceNewRelease(true);
        fans.confirmNotification();

        Sponsors sponsors = new Sponsors();

        sponsors.sponsorsList.add("SomeExecutive@SomeCompany");
        sponsors.sponsorsList.add("SomeOtherExecutive@SomeOtherCompasny");

        sponsors.announceNewRelease(false);
        sponsors.confirmNotification();
    }
}
