package com.filipsinovcic.zadatak_1;

import java.util.ArrayList;
import java.util.List;

public class User extends TemeljIzdavanja{
    private String name;
    private String adress;
    private String city;
    private String country;
    private ArrayList<String> options;
    private boolean isResident;


    public User(String name, String adress, String city, String country, ArrayList<String> options, boolean isResident) {
        this.name = name;
        this.adress = adress;
        this.city = city;
        this.country = country;
        this.options = options;
        this.isResident = isResident;

    }


  public void showInfo(){
      System.out.println("Ime:"+name+ "\n"+"Adress:"+adress+"\n"+"Payment method:"+psIfc.getClass().getSimpleName());
  }
}
