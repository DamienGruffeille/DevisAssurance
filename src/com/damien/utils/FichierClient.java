package com.damien.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.damien.entites.Personne;

public class FichierClient {

	protected static File fichierClient = new File("C://Users/AFPA/IdeaProjects/DevisAssurance/fichierClient.txt");

	private FichierClient() {
	}

	public static void ecritureFichierClient(Personne personne) {
		// Déclaration du fichier client

		// Si le fichier n'existe pas, je le créé
		if (!fichierClient.exists()) {
			try {
				fichierClient.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			// Si le fichier existe, je peux écrire dedans
			try {
				FileWriter writer = new FileWriter(fichierClient, true);
				BufferedWriter bw = new BufferedWriter(writer);
				bw.write(personne.getNom() + "," + personne.getPrenom() + "," + personne.getAge() + ","
						+ personne.getJeunecond() + "," + personne.getNbAccidents() + "," + personne.getFidelite() + ","
						+ personne.getStatut());
				bw.newLine();
				bw.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void lireFichierClient() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(fichierClient), "UTF-8"));
			String line = reader.readLine();

			while (line != null) {
				line = reader.readLine();
				System.out.println(line);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void modifierStatutFichierClient(Personne personne) {
		String line;
		StringBuffer sb = new StringBuffer();
		int nbLinesRead = 0;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fichierClient), "UTF8"));
			while ((line = br.readLine()) != null) {
				nbLinesRead++;
				String[] values = line.split(",");
				if (values[0].equals(personne.getNom())) {
					line = line.replace("Prospect", personne.getStatut());
				}
				sb.append(line + "\n");
			}
			br.close();
			BufferedWriter out = new BufferedWriter(new FileWriter(fichierClient));
			out.write(sb.toString());
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
