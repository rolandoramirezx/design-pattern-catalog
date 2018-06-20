package edu.depaul.cdm.se450.ramirez.Observer.With_Implementation;

import java.util.ArrayList;

public class RockBandWebsite implements Subject {

    private ArrayList<Observer> observers;
    public String newAlbumName = null;

    public RockBandWebsite() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void announceNewAlbum() {

        if (this.newAlbumName == null){
            return;
        } else {
            for (int i=0; i<observers.size(); i++){
                Observer observer = (Observer)observers.get(i);
                observer.update(this.newAlbumName);
            }
        }
    }

    public void setNewAlbumName(String newAlbumName){
        this.newAlbumName = newAlbumName;
    }
}
