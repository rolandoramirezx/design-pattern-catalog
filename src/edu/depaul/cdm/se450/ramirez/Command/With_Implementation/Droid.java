package edu.depaul.cdm.se450.ramirez.Command.With_Implementation;

import java.util.Arrays;
import java.util.HashMap;

public class Droid {

    String name;
    String[] books = new String[3];
    HashMap<String, String>contacts = new HashMap<>();

    public void setName(String name){
        this.name = name;
    }

    public void dispayContacts(){

        System.out.println(name +": Here are your contacts...");
        System.out.println(contacts.keySet().toString());
    }

    public void alphabetizeBooks(){

        Arrays.sort(books);
        System.out.println(name + ": I've alphabetized your book collection. Here's how I've ordered them...");
        for (String book: books){
            System.out.println(book);
        }
    }

}
