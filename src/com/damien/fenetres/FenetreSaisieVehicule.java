package com.damien.fenetres;

import com.damien.utils.CsvFile;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class FenetreSaisieVehicule extends JFrame implements ActionListener {

    String[] listeMarques = new String[CsvFile.getListe().size()];

    private void transformationArrayListEnArray() throws IOException {
        for (int i = 0; i < listeMarques.length; i++) {
            listeMarques[i] = CsvFile.getListe().get(i);
        }
    }

    public FenetreSaisieVehicule() throws IOException {
        super ("Sélection véhicule");
        JLabel lblMarque = new JLabel("Marque : ");
        JLabel lblModele = new JLabel("Modèle : ");
        JLabel lblPuissance = new JLabel("Puissance : CV");

        JComboBox<String> cbxMarque = new JComboBox<>(listeMarques);
        JComboBox<String> cbxModele = new JComboBox<>();

        JButton btnOK = new JButton("OK");

        JPanel pan1 = new JPanel(new GridLayout(3,2,5,5));
        pan1.setBorder(new EmptyBorder(20,20,20,20));
        pan1.add(lblMarque);
        pan1.add(cbxMarque);
        pan1.add(lblModele);
        pan1.add(cbxModele);
        pan1.add(lblPuissance);

        JPanel pan2 = new JPanel();
        pan2.add(btnOK);

        this.setLayout(new BorderLayout());
        this.add(pan1, BorderLayout.CENTER);
        this.add(pan2, BorderLayout.SOUTH);

        // Définition des caractéristiques du frame
        this.pack();
        this.setSize(400, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
