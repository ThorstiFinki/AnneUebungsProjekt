package com.example.anneuebungsprojekt.AutoArea;

public class Taxi extends Auto {

    private int anzahlPassagiere;
    private double preisProKilometer;

    public Taxi(String typ, int pS, int anzahlPassagiere, double preisProKilometer) {
        super(typ, pS);
        this.anzahlPassagiere = anzahlPassagiere;
        this.preisProKilometer = preisProKilometer;
    }

    public int getAnzahlPassagiere() {
        return anzahlPassagiere;
    }

    public double getPreisProKilometer() {
        return preisProKilometer;
    }

}