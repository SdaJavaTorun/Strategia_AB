package com.sdajava.strategia2;

public class Main {

    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik("Mechanik");
        pracownik1.execute();

        Pracownik pracownik2 = new Pracownik("Listonosz");
        pracownik2.execute();

        Pracownik pracownik3 = new Pracownik("Lekarz");
        pracownik3.execute();
    }
}
