package com.damien.application;

import com.damien.fenetres.FenetreSaisieInfos;
import com.damien.fenetres.FenetreSaisieVehicule;
import com.damien.utils.CsvFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CsvFile.lireFichierCsv();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            new FenetreSaisieVehicule();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //new FenetreSaisieInfos();
    }
}
