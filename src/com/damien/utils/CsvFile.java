package com.damien.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The type Csv file.
 */
public class CsvFile {

    private static ArrayList<String> listeMarques = new ArrayList<>();
    private static ArrayList<String> listeModeles = new ArrayList<>();
    // HashMap permettant de récupérer la puissance d'un modèle sélectionné
    private static HashMap<String, String> puissance = new HashMap<>();

    /**
     * Gets liste marques.
     *
     * @return the liste marques
     */
    public static ArrayList<String> getListeMarques() {
        return listeMarques;
    }

    /**
     * Sets liste marques.
     *
     * @param listeMarques the liste marques
     */
    public static void setListeMarques(ArrayList<String> listeMarques) {
        CsvFile.listeMarques = listeMarques;
    }

    /**
     * Gets liste modeles.
     *
     * @return the liste modeles
     */
    public static ArrayList<String> getListeModeles() {
        return listeModeles;
    }

    /**
     * Sets liste modeles.
     *
     * @param listeModeles the liste modeles
     */
    public static void setListeModeles(ArrayList<String> listeModeles) {
        CsvFile.listeModeles = listeModeles;
    }

    /**
     * Gets puissance.
     *
     * @return the puissance
     */
    public static HashMap<String, String> getPuissance() {
        return puissance;
    }

    /**
     * Sets puissance.
     *
     * @param puissance the puissance
     */
    public static void setPuissance(HashMap<String, String> puissance) {
        CsvFile.puissance = puissance;
    }

    /**
     * Lire fichier csv.
     *
     * @throws IOException the io exception
     */
    public static void lireFichierCsv() throws IOException {
        String path = "ListeVehicules";
        String line = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));

            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                // Si la marque n'est pas déjà présente dans l'ArrayList, je l'ajoute
                if (!listeMarques.contains(values[0])) {
                    listeMarques.add(values[0]);
                }

                listeModeles.add(values[1]);
                // HashMap permettant de récupérer la puissance du modèle sélectionné
                puissance.put(values[1], values[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
