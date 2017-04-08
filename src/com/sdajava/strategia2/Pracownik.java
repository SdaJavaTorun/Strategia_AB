package com.sdajava.strategia2;

import com.sdajava.strategia2.czasWolny.Literatura;
import com.sdajava.strategia2.czasWolny.Silownia;
import com.sdajava.strategia2.dojazd.Rower;
import com.sdajava.strategia2.dojazd.Samochod;
import com.sdajava.strategia2.praca.Leczenie;
import com.sdajava.strategia2.praca.NaprawaSamochodow;
import com.sdajava.strategia2.praca.RoznoszenieListow;

/**
 * Created by Andrzej on 08.04.2017.
 */
public class Pracownik {
    //Contex

    private String nazwaCiecia;


    public Pracownik(String nazwaCiecia) {
        this.nazwaCiecia = nazwaCiecia;
    }


    public void execute () {
        if(nazwaCiecia.equals("Mechanik")) {
            System.out.println("\n:: Mechanik ::");
            new NaprawaSamochodow().praca();
            new Samochod().dojezd();
            new Silownia().czsWolny();
        }
        else if(nazwaCiecia.equals("Listonosz")) {
            System.out.println("\n:: Listonosz ::");
            new RoznoszenieListow().praca();
            new Rower().dojezd();
            new Literatura().czsWolny();
        }
        else if(nazwaCiecia.equals("Lekarz")) {
            System.out.println("\n:: Lekarz ::");
            new Leczenie().praca();
            new Samochod().dojezd();
            new Literatura().czsWolny();
        }
    }
}




