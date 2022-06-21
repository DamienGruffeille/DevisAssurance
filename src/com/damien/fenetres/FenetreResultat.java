package com.damien.fenetres;

import com.damien.entites.Personne;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreResultat extends JFrame implements ActionListener {
    private JLabel lblIdentite1 = new JLabel("Client : " + Personne.getNom() + " " + Personne.getPrenom());
    private JLabel lblAge = new JLabel("Age : " + Personne.getAge() + " ans");
    private JLabel lblJeuneCond = new JLabel("Jeune Conducteur : " + Personne.getJeunecond());
    private JLabel lblAccidents = new JLabel("Nombre d'accidents : " + Personne.getNbAccidents());
    private JLabel lblFid = new JLabel("Eligible aux 10% de réduction : " + Personne.getFidelite());
    private JButton btnDevis = new JButton("Faire un devis");
    private JButton btnAnnuler = new JButton("Annuler");

    public FenetreResultat() {
        super("Résultat de la requête");

        // Panneau pour affichage des informations
        JPanel pan1 = new JPanel(new GridLayout(5, 1));
        // TODO ajout de la possibilite de sélectionner une marque, un modèle de véhicule
        // TODO Cette sélection permettra de définir auto le puissance CV
        pan1.add(lblIdentite1);
        pan1.add(lblAge);
        pan1.add(lblJeuneCond);
        pan1.add(lblAccidents);
        pan1.add(lblFid);

        // Panneau pour les boutons

        JPanel pan2 = new JPanel(new GridLayout(1, 2));
        pan2.add(btnDevis);
        pan2.add(btnAnnuler);

        // Ajout des panels au frame
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

