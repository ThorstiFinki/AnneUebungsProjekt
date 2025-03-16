package com.example.anneuebungsprojekt.AutoArea;

public class Taxi extends Auto {



    private int anzahlPassagiere;

    private boolean taxiLicht;

    public Taxi(String typ, int pS, int anzahlPassagiere, boolean taxiLicht) {
        super(typ, pS);
        this.anzahlPassagiere = anzahlPassagiere;
        this.taxiLicht = taxiLicht;
    }

    public int getAnzahlPassagiere() {
        return anzahlPassagiere;
    }
    public boolean isTaxiLicht() {
        return taxiLicht;
    }
}