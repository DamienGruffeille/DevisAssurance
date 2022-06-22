package com.damien.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class CsvFile {

    private static ArrayList<String> listeMarques = new ArrayList<>();
    private static ArrayList<String> listeModeles = new ArrayList<>();
    private static HashMap<String, String> puissance = new HashMap<>();

    public static ArrayList<String> getListeMarques() {
        return listeMarques;
    }

    public static void setListeMarques(ArrayList<String> listeMarques) {
        CsvFile.listeMarques = listeMarques;
    }

    public static ArrayList<String> getListeModeles() {
        return listeModeles;
    }

    public static void setListeModeles(ArrayList<String> listeModeles) {
        CsvFile.listeModeles = listeModeles;
    }

    public static HashMap<String, String> getPuissance() {
        return puissance;
    }

    public static void setPuissance(HashMap<String, String> puissance) {
        CsvFile.puissance = puissance;
    }

    public static void lireFichierCsv() throws IOException {
        // TODO passer le path en parametre pour reutiliser cette méthode
        String path = "ListeVehicules";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                //System.out.println(values[0]);
                listeMarques.add(values[0]);
                listeModeles.add(values[1]);
                puissance.put(values[1], values[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

//        ListIterator<String> li = listeModeles.listIterator();
//
//        while (li.hasNext()) {
//            System.out.println(li.next());
//        }

    }

}
