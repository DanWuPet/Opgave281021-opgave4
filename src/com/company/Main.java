package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            Person p = new Person(1,"Pernille",10.5);
            skriv1(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //skrivDatFil();
        //laesDatFil();

    }

    public void skriv() {
        try {
            PrintWriter ud = new PrintWriter("MyFileEks.txt");
            int i = 1;
            String navn = "Hejsa";
            float tal = (float) 10.5;
            ud.format("%d %s %f");
            ud.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void skriv1(Person p){
        try {
            PrintWriter ud = new PrintWriter("MyFileEks1.txt");
            ud.format("%d %s %f",p.getNr(),p.getNavn(),p.getTal());
            ud.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void laesDatFil() {
        try {
            DataInputStream input = new DataInputStream(new FileInputStream("temp2.dat"));
            int i;
            String navn;
            float tal;
            i = input.readInt();
            navn = input.readUTF();
            tal = input.readFloat();
            System.out.printf("%d %s %f", i, navn, tal);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void skrivDatFil() {
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("temp2.dat"));
            int i = 1;
            String navn = "Pernille";
            float tal = (float) 10.5;
            output.writeInt(i);
            output.writeUTF(navn);
            output.writeFloat(tal);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static Person indTxtFil(){
        try{
            File in = new File("MyFileEks2.txt");
            Scanner ind = new Scanner(in);
            Person p = new Person();
            p.setNr(ind.nextInt());
            p.setNavn(ind.next());
            p.setTal(ind.nextDouble());
            return p;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    static void AdderTilTabel(int[] tabel, int antal, int tal){
        for(int i = 0; i < antal; i++)
            tabel[i] += tal;
    }


}
