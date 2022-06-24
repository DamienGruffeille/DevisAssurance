package com.damien.uicomponent;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * Classe charg�e de creer la fenetre principale.
 *
 */

public class MainFrame {

	private JFrame fenetrePrincipal = new JFrame("Menu");

	private JLabel bienvenue = new JLabel("Bienvenue");
	private JLabel selection = new JLabel("Merci de sélectionner " + "l'action désirée : ");

	private JButton devis = new JButton("Faire un devis");
	private JButton listeClients = new JButton("Afficher le fichier clients");

	private JPanel pan1 = new JPanel(new GridLayout(2, 1));
	private JPanel pan2 = new JPanel(new GridLayout(2, 1));

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

	public MainFrame() {

		setUpLayout();

	}

	private void setUpLayout() {

		pan1.add(bienvenue);
		pan1.add(selection);

		pan2.add(devis);
		pan2.add(listeClients);

		fenetrePrincipal.setLayout(new BorderLayout());
		fenetrePrincipal.add(pan1, BorderLayout.CENTER);
		fenetrePrincipal.add(pan2, BorderLayout.SOUTH);

	}

	public void show() {

		fenetrePrincipal.pack();
		fenetrePrincipal.setSize(FRAME_WIDTH, FRAME_HEIGTH);
		fenetrePrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		fenetrePrincipal.setLocationRelativeTo(null);
		fenetrePrincipal.setVisible(true);

	}

	public JFrame getFenetrePrincipal() {
		return fenetrePrincipal;
	}

	public void setFenetrePrincipal(JFrame fenetrePrincipal) {
		this.fenetrePrincipal = fenetrePrincipal;
	}

	public JLabel getBienvenue() {
		return bienvenue;
	}

	public void setBienvenue(JLabel bienvenue) {
		this.bienvenue = bienvenue;
	}

	public JLabel getSelection() {
		return selection;
	}

	public void setSelection(JLabel selection) {
		this.selection = selection;
	}

	public JButton getDevis() {
		return devis;
	}

	public void setDevis(JButton devis) {
		this.devis = devis;
	}

	public JButton getListeClients() {
		return listeClients;
	}

	public void setListeClients(JButton listeClients) {
		this.listeClients = listeClients;
	}

	public JPanel getPan1() {
		return pan1;
	}

	public void setPan1(JPanel pan1) {
		this.pan1 = pan1;
	}

	public JPanel getPan2() {
		return pan2;
	}

	public void setPan2(JPanel pan2) {
		this.pan2 = pan2;
	}

	public static int getFrameWidth() {
		return FRAME_WIDTH;
	}

	public static int getFrameHeigth() {
		return FRAME_HEIGTH;
	}

}
