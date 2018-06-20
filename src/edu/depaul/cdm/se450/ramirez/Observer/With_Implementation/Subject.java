package edu.depaul.cdm.se450.ramirez.Observer.With_Implementation;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void announceNewAlbum();
}
