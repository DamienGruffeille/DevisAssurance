package com.damien.application;

import com.damien.entites.Personne;
import com.damien.fenetres.FenetreSaisieInfos;
import com.damien.fenetres.FenetreSaisieVehicule;
import com.damien.utils.CsvFile;

import java.io.IOException;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
//        try {
//            CsvFile.lireFichierCsv();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        new FenetreSaisieVehicule();
        new FenetreSaisieInfos();
    }
}
