package com.damien.fenetres;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreSaisieVehicule extends JFrame implements ActionListener {

    public FenetreSaisieVehicule() {
        JLabel lblMarque = new JLabel("Marque : ");
        JLabel lblModele = new JLabel("Modèle : ");
        JLabel lblPuissance = new JLabel("Puissance : CV");

        JComboBox<String> cbxMarque = new JComboBox<>();
        JComboBox<String> cbxModele = new JComboBox<>();

        JButton btnOK = new JButton("OK");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
