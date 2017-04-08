package com.sdajava.strategia2;

import com.sdajava.strategia2.czasWolny.Literatura;
import com.sdajava.strategia2.czasWolny.Silownia;
import com.sdajava.strategia2.czasWolny.WolnyCzas;
import com.sdajava.strategia2.dojezdzac.Dojezdzac;
import com.sdajava.strategia2.dojezdzac.Rower;
import com.sdajava.strategia2.dojezdzac.Samochod;
import com.sdajava.strategia2.pracowac.Leczenie;
import com.sdajava.strategia2.pracowac.NaprawaSamochodow;
import com.sdajava.strategia2.pracowac.Pracowac;
import com.sdajava.strategia2.pracowac.RoznoszenieListow;

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
            new NaprawaSamochodow().pracowac();
            new Samochod().dojezdzac();
            new Silownia().wolnyCzas();
        }
        else if(nazwaCiecia.equals("Listonosz")) {
            System.out.println("\n:: Listonosz ::");
            new RoznoszenieListow().pracowac();
            new Rower().dojezdzac();
            new Literatura().wolnyCzas();
        }
        else if(nazwaCiecia.equals("Lekarz")) {
            System.out.println("\n:: Lekarz ::");
            new Leczenie().pracowac();
            new Samochod().dojezdzac();
            new Literatura().wolnyCzas();
        }
    }
}




