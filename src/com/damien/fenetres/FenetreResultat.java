package com.damien.fenetres;

import com.damien.entites.Personne;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Fenetre resultat.
 */
public class FenetreResultat extends JFrame implements ActionListener {
    private final int PRIX_CV = 50;
    private final double TAUX_REDUC = 0.1;
    private int tarif;
    private double reduc;
    /**
     * Instantiates a new Fenetre resultat.
     *
     * @param personne the personne
     */
    public FenetreResultat(Personne personne, String marqueVeh, String modeleVeh, int puissance) {
        super("Résultat de la requête");

        tarif = PRIX_CV * puissance;

        if(personne.getFidelite().equals("Oui")){
            reduc = tarif * TAUX_REDUC;
        }

        JLabel lblIdentite1 = new JLabel("Client : " + personne.getNom() + " " + personne.getPrenom());
        JLabel lblAge = new JLabel("Age : " + personne.getAge() + " ans");
        JLabel lblJeuneCond = new JLabel("Jeune Conducteur : " + personne.getJeunecond());
        JLabel lblAccidents = new JLabel("Nombre d'accidents : " + personne.getNbAccidents());
        JLabel lblFid = new JLabel("Eligible aux 10% de réduction : " + personne.getFidelite());
        JLabel lblSeparation = new JLabel("----------------------------------------------------");
        JLabel infoVeh = new JLabel("Informations sur le véhicule à assurer : ");
        JLabel lblMarqueVeh = new JLabel("Marque du véhicule : " + marqueVeh);
        JLabel lblModeleVeh = new JLabel("Modèle du véhicule : " + modeleVeh);
        JLabel lblTarifAss = new JLabel("Tarif de l'assurance : " + tarif + " €");
        JLabel lblReduc    = new JLabel("Montant de la réduction fidélité : " + reduc + " €");
        JButton btnDevis = new JButton("Faire un devis");
        JButton btnAnnuler = new JButton("Annuler");

        // Panneau pour affichage des informations
        JPanel pan1 = new JPanel(new GridLayout(11, 1));
        // TODO ajout de la possibilite de sélectionner une marque, un modèle de véhicule
        // TODO Cette sélection permettra de définir auto le puissance CV
        pan1.add(lblIdentite1);
        pan1.add(lblAge);
        pan1.add(lblJeuneCond);
        pan1.add(lblAccidents);
        pan1.add(lblFid);
        pan1.add(lblSeparation);
        pan1.add(infoVeh);
        pan1.add(lblMarqueVeh);
        pan1.add(lblModeleVeh);
        pan1.add(lblTarifAss);
        pan1.add(lblReduc);

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

