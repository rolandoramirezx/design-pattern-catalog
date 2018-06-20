package edu.depaul.cdm.se450.ramirez.Observer.With_Implementation;

public class Main {

    public static void main (String[] args){

        RockBandWebsite theBeatlesWebsite = new RockBandWebsite();
        Fans fans = new Fans();
        Sponsors sponsors = new Sponsors();

        theBeatlesWebsite.registerObserver(fans);
        theBeatlesWebsite.registerObserver(sponsors);

        theBeatlesWebsite.setNewAlbumName("Revolver II");

        theBeatlesWebsite.announceNewAlbum();
    }
}
