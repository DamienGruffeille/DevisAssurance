package com.damien.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

public class CsvFile {

    public static ArrayList<String> getListe() {
        return liste;
    }

    //private static ArrayList<String> listeMarque = new ArrayList<>();
    private static ArrayList<String> liste = new ArrayList<>();

    public static ArrayList<String> lireFichierCsv() throws IOException {
        // TODO passer le path en parametre pour reutiliser cette méthode
        String path = "ListeVehicules";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                //String[] values = line.split(";");
                //listeMarque.add(values[0]);
                liste.add(String.valueOf(line.split(";")));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        ListIterator<String> li = liste.listIterator();

        while (li.hasNext()) {
            System.out.println(li.next());
        }
        return liste;
    }

}
