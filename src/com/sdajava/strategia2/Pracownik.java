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

    private Pracowac pracowac;
    private Dojezdzac dojezdzac;
    private WolnyCzas wolnyCzas;


    public Pracownik(String workerName){
        switch (workerName) {
            case "Mechanik" :
                System.out.println("\nMechanik:");
                this.pracowac = new NaprawaSamochodow();
                this.dojezdzac = new Samochod();
                this.wolnyCzas = new Silownia();
            case "Listonosz":
                System.out.println("\nListonosz:");
                this.pracowac = new RoznoszenieListow();
                this.dojezdzac = new Rower();
                this.wolnyCzas = new Literatura();
            case "Lekarz":
                System.out.println("\nLekarz:");
                this.pracowac = new Leczenie();
                this.dojezdzac = new Samochod();
                this.wolnyCzas = new Literatura();
        }
    }

    public void execute () {
        pracowac.pracowac();
        dojezdzac.dojezdzac();
        wolnyCzas.wolnyCzas();
    }
}
