package com.damien.fenetres;

import com.damien.entites.Personne;
import com.damien.utils.fichierClient;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Fenetre resultat.
 */
public class FenetreResultat extends JFrame implements ActionListener {
    /**
     * reduc.
     */
    private double reduc;
    /**
     * prix par CV.
     */
    private static final int PRIX_CV = 50;
    /**
     * taux de reduction.
     */
    private static final double TAUX_REDUC = 0.1;
    /**
     * personne.
     */
    private final Personne personne;
    /**
     * The Frame Width.
     */
    private static final int FRAME_WIDTH = 300;
    /**
     * The Frame Heigth.
     */
    private static final int FRAME_HEIGTH = 150;

    /**
     * Instantiates a new Fenetre resultat.
     *
     * @param personne  the personne
     * @param marqueVeh the marque veh
     * @param modeleVeh the modele veh
     * @param puissance the puissance
     */
    public FenetreResultat(final Personne personne,
                           final String marqueVeh,
                           final String modeleVeh,
                           final int puissance) {
        super("Résultat de la requête");

        this.personne = personne;
        final int tarif = PRIX_CV * puissance;
        final int pan1Rows = 11;

        if (personne.getFidelite().equals("Oui")) {
            reduc = tarif * TAUX_REDUC;
        }

        JLabel lblIdentite1 = new JLabel(
                "Client : "
                        + personne.getNom()
                        + " "
                        + personne.getPrenom());
        JLabel lblAge = new JLabel(
                "Age : "
                        + personne.getAge()
                        + " ans");
        JLabel lblJeuneCond = new JLabel(
                "Jeune Conducteur : "
                        + personne.getJeunecond());
        JLabel lblAccidents = new JLabel(
                "Nombre d'accidents : "
                        + personne.getNbAccidents());
        JLabel lblFid = new JLabel(
                "Eligible aux 10% de réduction : "
                        + personne.getFidelite());
        JLabel lblSeparation = new JLabel(
                "----------------------------------------------------");
        JLabel infoVeh = new JLabel(
                "Informations sur le véhicule à assurer : ");
        JLabel lblMarqueVeh = new JLabel(
                "Marque du véhicule : "
                        + marqueVeh);
        JLabel lblModeleVeh = new JLabel(
                "Modèle du véhicule : "
                        + modeleVeh);
        JLabel lblTarifAss = new JLabel(
                "Tarif de l'assurance : "
                        + tarif
                        + " €");
        JLabel lblReduc = new JLabel(
                "Montant de la réduction fidélité : "
                        + reduc
                        + " €");
        JButton btnSouscrire = new JButton(
                "Souscrire");
        JButton btnAnnuler = new JButton(
                "Annuler");

        // Panneau pour affichage des informations
        JPanel pan1 = new JPanel(new GridLayout(pan1Rows, 1));
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
        pan2.add(btnSouscrire);
        // J'ajoute un listener qui appelle
        // la méthode définissant les actions à réaliser
        btnSouscrire.addActionListener(this::btnSouscrireListener);
        pan2.add(btnAnnuler);
        // Listener permettant de fermer la fenêtre,
        // et sélectionner un autre véhicule
        btnAnnuler.addActionListener(event -> this.dispose());

        // Ajout des panels au frame
        this.setLayout(new BorderLayout());
        this.add(pan1, BorderLayout.CENTER);
        this.add(pan2, BorderLayout.SOUTH);

        // Définition des caractéristiques du frame
        this.pack();
        this.setSize(FRAME_WIDTH, FRAME_HEIGTH);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void btnSouscrireListener(final ActionEvent event) {
        personne.setStatut("Client");
        fichierClient.modifierStatutFichierClient(personne);
        System.out.println(personne.getStatut());
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        //TODO action des boutons
    }
}

