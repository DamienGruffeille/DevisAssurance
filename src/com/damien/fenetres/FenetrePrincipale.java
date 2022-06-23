package com.damien.fenetres;

import com.damien.utils.FichierClient;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Fenetre principale.
 */
public class FenetrePrincipale extends JFrame implements ActionListener {
    /**
     * The Frame Width.
     */
    private static final int FRAME_WIDTH = 300;
    /**
     * The Frame Heigth.
     */
    private static final int FRAME_HEIGTH = 150;
    /**
     * Instantiates a new Fenetre principale.
     */
    public FenetrePrincipale() {
        super("Menu");
        JLabel bienvenue = new JLabel("Bienvenue");
        JLabel selection = new JLabel("Merci de sélectionner "
                + "l'action désirée : ");
        JButton devis = new JButton("Faire un devis");
        JButton listeClients = new JButton("Afficher le fichier clients");

        JPanel pan1 = new JPanel(new GridLayout(2, 1));
        pan1.add(bienvenue);
        pan1.add(selection);

        JPanel pan2 = new JPanel(new GridLayout(2, 1));
        devis.addActionListener((event -> new FenetreSaisieInfos()));
        pan2.add(devis);
        listeClients.addActionListener(
                (event -> FichierClient.lireFichierClient()));
        pan2.add(listeClients);

        // Ajout des panels au frame
        this.setLayout(new BorderLayout());
        this.add(pan1, BorderLayout.CENTER);
        this.add(pan2, BorderLayout.SOUTH);

        // Définition des caractéristiques du frame
        this.pack();
        this.setSize(FRAME_WIDTH, FRAME_HEIGTH);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        // géré directement depuis l'ajout des actionListener sur les boutons
    }
}
