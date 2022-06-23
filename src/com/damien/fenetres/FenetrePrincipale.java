package com.damien.fenetres;

import com.damien.utils.fichierClient;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetrePrincipale extends JFrame implements ActionListener {

    public FenetrePrincipale() {
        super("Menu");
        JLabel bienvenue = new JLabel("Bienvenue");
        JLabel selection = new JLabel("Merci de sélectionner l'action désirée : ");
        JButton devis = new JButton("Faire un devis");
        JButton listeClients = new JButton("Afficher le fichier clients");

        JPanel pan1 = new JPanel(new GridLayout(2,1));
        pan1.add(bienvenue);
        pan1.add(selection);

        JPanel pan2 = new JPanel(new GridLayout(2,1));
        devis.addActionListener( (event -> new FenetreSaisieInfos()));
        pan2.add(devis);
        listeClients.addActionListener((event -> fichierClient.lireFichierClient()));
        pan2.add(listeClients);

        // Ajout des panels au frame
        this.setLayout(new BorderLayout());
        this.add(pan1, BorderLayout.CENTER);
        this.add(pan2, BorderLayout.SOUTH);

        // Définition des caractéristiques du frame
        this.pack();
        this.setSize(300, 150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
