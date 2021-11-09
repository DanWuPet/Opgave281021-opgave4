package com.company;

public class Person{
    private int nr;
    private String navn;
    private double tal;

    public Person(){
        this.nr = nr;
        this.navn = navn;
        this.tal = tal;
    }
    public Person(int nr, String navn, double tal){
        this.nr = nr;
        this.navn = navn;
        this.tal = tal;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    public double getTal() {
        return tal;
    }

    public void setTal(double tal) {
        this.tal = tal;
    }
}
