package com.example.anneuebungsprojekt.AutoArea;

public class Taxi extends Auto {

    public int getAnzahlPassagiere() {
        return anzahlPassagiere;
    }

    private int anzahlPassagiere;

    public Taxi(String typ, int pS, int anzahlPassagiere) {
        super(typ, pS);
        this.anzahlPassagiere = anzahlPassagiere;
    }

}