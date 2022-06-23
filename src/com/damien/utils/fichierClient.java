package com.damien.utils;

import com.damien.entites.Personne;

import java.io.*;

public class fichierClient {
    protected static File fichierClient = new File("C://Users/AFPA/IdeaProjects/DevisAssurance/fichierClient.txt");
    public static void ecritureFichierClient(Personne personne){
        // Déclaration du fichier client


        // Si le fichier n'existe pas, je le créé
        if(!fichierClient.exists()) {
            try {
                fichierClient.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // Si le fichier existe, je peux écrire dedans
            try {
                FileWriter writer = new FileWriter(fichierClient,true);
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write(personne.getNom() + "," + personne.getPrenom() + "," + personne.getAge() + "," + personne.getJeunecond() + "," + personne.getNbAccidents() + "," + personne.getFidelite()+ "," + personne.getStatut());
                bw.newLine();
                bw.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void lireFichierClient(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fichierClient), "UTF-8"));
            String line = reader.readLine();

            while (line != null) {
                line = reader.readLine();
                System.out.println(line);
            }
            reader.close();

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
