package com.damien.application;

import javax.swing.SwingUtilities;

import com.damien.fenetres.FenetrePrincipale;

/**
 * The type Main.
 */
public class Main {
	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {

		// Convention Swing, afin d'éviter des problèmes quand on a plusieurs thread.

		SwingUtilities.invokeLater(() -> new FenetrePrincipale());

	}
}
