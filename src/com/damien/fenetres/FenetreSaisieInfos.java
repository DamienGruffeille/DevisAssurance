package com.damien.fenetres;

import com.damien.entites.Personne;
import com.damien.utils.CalculPoints;
import com.damien.utils.CsvFile;
import com.damien.utils.FichierClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import static java.awt.GridBagConstraints.REMAINDER;

/**
 * The type Fenetre saisie infos.
 */
public class FenetreSaisieInfos extends JFrame implements ActionListener {
    private static final String[] LISTE_NB_ACCIDENTS = {"1", "2", "3+"};
    private static String jeuneCond = "Non";
    private static JCheckBox checkJeuneConducteurOui = new JCheckBox("Oui");
    private JLabel lblNom = new JLabel("Nom : ");
    private JLabel lblPrenom = new JLabel("Prénom : ");
    private JLabel lblAge = new JLabel("Age : ");
    private JLabel lblJeuneConducteur = new JLabel("Jeune conducteur ? ");
    private JLabel lblAccidents = new JLabel("Avez-vous déjà eu un accident ? ");
    private JLabel lblNbAccidents = new JLabel("Combien ? ");
    private JLabel lblAnciennete = new JLabel("Plus de 5 ans d'ancienneté ? ");
    private JTextField txtNom = new JTextField();
    private JTextField txtPrenom = new JTextField();
    private JTextField txtAge = new JTextField();
    private JCheckBox checkJeuneConducteurNon = new JCheckBox("Non", true);
    private JCheckBox checkAccidentNon = new JCheckBox("Non", true);
    private JCheckBox checkAccidentOui = new JCheckBox("Oui");
    private JComboBox<String> cbxNbAccidents = new JComboBox<>(LISTE_NB_ACCIDENTS);
    private JRadioButton anciennete = new JRadioButton("Oui");
    private JButton btnOk = new JButton("OK");
    private JButton btnEffacer = new JButton("Effacer");

    /**
     * Gets jeune cond.
     *
     * @return the jeune cond
     */
    public static String getJeuneCond() {
        return jeuneCond;
    }

    /**
     * Instantiates a new Fenetre saisie infos.
     */
    public FenetreSaisieInfos() {
        super("Infos générales");

        //Définition des panels
        // Panel pour la saisie des informations
        JPanel pan1 = new JPanel();
        GridBagLayout gb = new GridBagLayout();
        pan1.setLayout(gb);

        // Panel pour les boutons
        JPanel pan2 = new JPanel(new GridLayout(1, 2));

        // Ajout des widgets aux panels et positionnement des éléments
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gb.setConstraints(lblNom, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = REMAINDER;
        gb.setConstraints(txtNom, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gb.setConstraints(lblPrenom, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = REMAINDER;
        gb.setConstraints(txtPrenom, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gb.setConstraints(lblAge, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = REMAINDER;
        gb.setConstraints(txtAge, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gb.setConstraints(lblJeuneConducteur, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gb.setConstraints(checkJeuneConducteurNon, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        gb.setConstraints(checkJeuneConducteurOui, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gb.setConstraints(lblAccidents, gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        gb.setConstraints(checkAccidentNon, gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        gb.setConstraints(checkAccidentOui, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gb.setConstraints(lblNbAccidents, gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = REMAINDER;
        gb.setConstraints(cbxNbAccidents, gbc);

        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 6;
        gb.setConstraints(lblAnciennete, gbc);
        gbc.gridx = 1;
        gbc.gridy = 6;
        gb.setConstraints(anciennete, gbc);

        // Gestion des boutons checkAccident et liste déroulante nbAccidents
        // en fonction de la sélection faite par user
        cbxNbAccidents.setEnabled(false);
        checkAccidentOui.addActionListener(this::chkAccO);
        checkAccidentNon.addActionListener(this::chkAccN);

        btnOk.addActionListener(this);
        btnEffacer.addActionListener(this);

        // TODO bug on peut décocher le bouton non au lancement sans que oui soit coché
        checkJeuneConducteurOui.addActionListener(event -> checkJeuneConducteurNon.setSelected(false));
        checkJeuneConducteurNon.addActionListener(event -> checkJeuneConducteurOui.setSelected(false));

        pan1.add(lblNom);
        pan1.add(txtNom);
        pan1.add(lblPrenom);
        pan1.add(txtPrenom);
        pan1.add(lblAge);
        pan1.add(txtAge);
        pan1.add(lblJeuneConducteur);
        pan1.add(checkJeuneConducteurNon);
        pan1.add(checkJeuneConducteurOui);
        pan1.add(lblAccidents);
        pan1.add(checkAccidentNon);
        pan1.add(checkAccidentOui);
        pan1.add(lblNbAccidents);
        pan1.add(cbxNbAccidents);
        pan1.add(lblAnciennete);
        pan1.add(anciennete);

        pan2.add(btnOk);
        pan2.add(btnEffacer);

        // Ajout des panels au frame
        this.setLayout(new BorderLayout());
        this.add(pan1, BorderLayout.CENTER);
        this.add(pan2, BorderLayout.SOUTH);

        // Définition des caractéristiques du frame
        this.pack();
        this.setSize(400, 300);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    private void chkAccN(ActionEvent actionEvent) {
        cbxNbAccidents.setEnabled(!checkCheckAccidentNon());
        checkAccidentOui.setSelected(false);
    }

    private void chkAccO(ActionEvent actionEvent) {
        cbxNbAccidents.setEnabled(checkCheckAccidentOui());
        checkAccidentNon.setSelected(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnOk) {

            // Nombre d'accidents à afficher
            String nbAcc = "0";
            if (checkAccidentOui.isSelected()) {
                nbAcc = String.valueOf(cbxNbAccidents.getSelectedItem());
            }

            // Bonus fidelite > 5 ans
            String bonusFid = "Non";
            if (anciennete.isSelected()) {
                bonusFid = "Oui";
            }

            // Jeune conducteur
            if (checkJeuneConducteurOui.isSelected()) {
                jeuneCond = "Oui";
            }

            // Création de l'objet Personne à partir des données saisies
            Personne personne = new Personne(
                    txtNom.getText(),
                    txtPrenom.getText(),
                    Integer.parseInt(txtAge.getText()),
                    jeuneCond,
                    nbAcc,
                    bonusFid);

            FichierClient.ecritureFichierClient(personne);

            if (CalculPoints.calculPoints(personne) >= 0) {
                try {
                    CsvFile.lireFichierCsv();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                new FenetreSaisieVehicule(personne);

            } else {
                String message = "Cette personne n'est pas assurable";
                new FenetreErreur(message);
            }
            // TODO enregistrement de la personne dans fichier csv

        }

        if (e.getSource() == btnEffacer) {
            txtNom.setText("");
            txtPrenom.setText("");
            txtAge.setText("");
            checkAccidentNon.setSelected(true);
            checkAccidentOui.setSelected(false);
            checkJeuneConducteurNon.setSelected(true);
            checkJeuneConducteurOui.setSelected(false);
            anciennete.setSelected(false);
            cbxNbAccidents.setSelectedIndex(0);
        }
    }

    // Récupère la valeur de "est sélectionné" de la checkBox checkAccidentNon
    private boolean checkCheckAccidentOui() {
        return checkAccidentOui.isSelected();
    }

    // Récupère la valeur de "est sélectionné" de la checkBox checkAccidentOui
    private boolean checkCheckAccidentNon() {
        return checkAccidentNon.isSelected();
    }

}

