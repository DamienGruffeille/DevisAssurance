package com.damien.fenetres;

import com.damien.entites.Personne;
import com.damien.utils.CsvFile;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * The type Fenetre saisie vehicule.
 */
public class FenetreSaisieVehicule extends JFrame implements ActionListener {
    // Création d'un tableau de String pour cbx de la Frame
    private String[] listeMarques = new String[CsvFile.getListeMarques().size()];
    private String[] listeModeles = new String[CsvFile.getListeModeles().size()];
    private JComboBox<String> cbxModele;
    private JComboBox<String> cbxMarque;
    private JButton btnOK = new JButton("OK");
    private JLabel lblPuissance;
    private Personne personne;
    private int puissance;
    private String marqueVeh;
    private String modeleVeh;

    public String getMarqueVeh() {
        return marqueVeh;
    }

    public void setMarqueVeh(String marqueVeh) {
        this.marqueVeh = marqueVeh;
    }

    public String getModeleVeh() {
        return modeleVeh;
    }

    public void setModeleVeh(String modeleVeh) {
        this.modeleVeh = modeleVeh;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    /**
     * Instantiates a new Fenetre saisie vehicule.
     *
     * @throws IOException the io exception
     */
    public FenetreSaisieVehicule(Personne personne) {
        super("Sélection véhicule");
        this.personne = personne;
        // Transformation de l'ArrayList en tableau de String pour affichage dans cbx
        for (int i = 0; i < listeMarques.length; i++) {
            listeMarques[i] = CsvFile.getListeMarques().get(i);
        }
        for (int i = 0; i < listeModeles.length; i++) {
            listeModeles[i] = CsvFile.getListeModeles().get(i);
        }

        JLabel lblInfo = new JLabel(personne.getNom() + " " + personne.getPrenom());
        JLabel lblInfo2 = new JLabel(" est assurable.");
        JLabel lblMarque = new JLabel("Marque : ");
        JLabel lblModele = new JLabel("Modèle : ");
        JLabel lblPuiss = new JLabel("Puissance : ");
        lblPuissance = new JLabel();

        cbxMarque = new JComboBox<>(listeMarques);
        cbxMarque.addActionListener(this);

        cbxModele = new JComboBox<>(listeModeles);
        cbxModele.addActionListener(this);



        //btnOK.setEnabled(false);
        btnOK.addActionListener(this);

        JPanel pan1 = new JPanel(new GridLayout(4, 2, 5, 5));
        pan1.setBorder(new EmptyBorder(20, 20, 20, 20));
        pan1.add(lblInfo);
        pan1.add(lblInfo2);
        pan1.add(lblMarque);
        pan1.add(cbxMarque);
        pan1.add(lblModele);
        pan1.add(cbxModele);
        pan1.add(lblPuiss);
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
        // Le choix de la marque détermine la sélection du modèle possible
        // i.e éviter de pouvoir sélectionner Peugeot Clio par ex
        //TODO récupérer automatique les modèles d'une même marque
        if (e.getSource() == cbxMarque) {
            if (cbxMarque.getSelectedItem().equals("Peugeot")){
                cbxModele.removeAllItems();
                cbxModele.addItem("208");
                cbxModele.addItem("308");
                cbxModele.addItem("508");

            } else if (cbxMarque.getSelectedItem().equals("Renault")) {
                cbxModele.removeAllItems();
                cbxModele.addItem("Clio");
                cbxModele.addItem("Megane");
                cbxModele.addItem("Espace");
            } else if (cbxMarque.getSelectedItem().equals("Citroen")){
                cbxModele.removeAllItems();
                cbxModele.addItem("C3");
                cbxModele.addItem("C4");
            } else {
                cbxModele.removeAllItems();
                cbxModele.addItem("Modele");
            }
        }
        // La sélection d'un modèle fait apparaitre la puissance de celui-ci
        if (e.getSource() == cbxModele) {
            lblPuissance.setText(CsvFile.getPuissance().get(cbxModele.getSelectedItem()) + " CV");
        }

        if (e.getSource() == btnOK) {
            puissance = Integer.parseInt(CsvFile.getPuissance().get(cbxModele.getSelectedItem()));
            marqueVeh = String.valueOf(cbxMarque.getSelectedItem());
            modeleVeh = String.valueOf(cbxModele.getSelectedItem());
            new FenetreResultat(personne, marqueVeh, modeleVeh, puissance);

            }
        }


    private void checkBtn() {
        boolean value = !cbxMarque.getSelectedItem().equals("Marque") && !cbxModele.getSelectedItem().equals("Modèle");
        btnOK.setEnabled(value);
    }


}
