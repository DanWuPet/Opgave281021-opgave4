package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class read {
    public static void readFile(int[] nr, String[] navne, float[] iq){
        try {
            File myObj = new File("persondata.txt");
            Scanner read = new Scanner(myObj);
            int i = 0;
            int readnr;
            String navn;
            float dumbo;

            while(read.hasNext()){
                readnr = read.nextInt();
                navn = read.nextLine();

                System.out.println(readnr + navn);
                nr[i] = readnr;
                navne[i] = navn;
                i++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fandt ikke filen.");
            e.printStackTrace();
        }
    }
}
