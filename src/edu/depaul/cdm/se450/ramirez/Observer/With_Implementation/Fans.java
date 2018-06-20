package edu.depaul.cdm.se450.ramirez.Observer.With_Implementation;

public class Fans implements Observer {

    @Override
    public void update(String newAlbumName) {
        System.out.printf("Fans have been notified of new album titled: " + newAlbumName + "\n");
    }
}
