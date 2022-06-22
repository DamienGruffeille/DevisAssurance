package com.damien.fenetres;

import com.damien.utils.CsvFile;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;

public class FenetreSaisieVehicule extends JFrame implements ActionListener, ItemListener {
    // Création d'un tableau de String pour cbx de la Frame
    private String[] listeMarques = new String[CsvFile.getListeMarques().size()];
    private String[] listeModeles = new String[CsvFile.getListeModeles().size()];


    public FenetreSaisieVehicule() throws IOException {
        super ("Sélection véhicule");

        // Transformation de l'ArrayList en tableau de String pour affichage dans cbx
        for (int i = 0; i < listeMarques.length; i++) {
            listeMarques[i] = CsvFile.getListeMarques().get(i);
            System.out.println(listeMarques[i]);
        }
        for (int i = 0; i < listeModeles.length; i++) {
            listeModeles[i] = CsvFile.getListeModeles().get(i);
            System.out.println(listeModeles[i]);
        }

        JLabel lblMarque = new JLabel("Marque : ");
        JLabel lblModele = new JLabel("Modèle : ");
        JLabel lblPuissance = new JLabel("Puissance : CV");

        JComboBox<String> cbxMarque = new JComboBox<>(listeMarques);
        cbxMarque.addItemListener(this);
        JComboBox<String> cbxModele = new JComboBox<>(listeModeles);
        cbxModele.addItemListener(this);

        JButton btnOK = new JButton("OK");
        btnOK.setEnabled(false);
        btnOK.addActionListener(this);

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
        if(e.getSource() == "btnOK"){

        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
//        Object obj = cbxMarque.getItem();
    }
}
