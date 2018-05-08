/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Samochod {
    
    public static void main(String args[])
    {
        ArrayList<Object> samochody = new ArrayList<>();
        Samochod s1 = new Samochod("volvo","asd",220,31000);
        samochody.add(s1);
    }
    
    private String marka;
    private String nazwa;
    private double predkosc_max;
    private double cena;

    public Samochod(String marka, String nazwa, double predkosc_max, double cena) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.predkosc_max = predkosc_max;
        this.cena = cena;
    }
    
 

    public String getMarka() {
        return marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getPredkosc_max() {
        return predkosc_max;
    }

    public double getCena() {
        return cena;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPredkosc_max(double predkosc_max) {
        this.predkosc_max = predkosc_max;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }
    
    
    
}
