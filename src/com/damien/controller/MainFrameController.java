package com.damien.controller;

import com.damien.fenetres.FenetreSaisieInfos;
import com.damien.uicomponent.MainFrame;
import com.damien.utils.FichierClient;

/**
 * Classe chargée d'attribuer les events et de piloter la fenetre principale.
 *
 */

public class MainFrameController {

	private MainFrame mainFrame;

	public MainFrameController(MainFrame mainFrame) {

		this.mainFrame = mainFrame;
		setUpEvent();
	}

	private void setUpEvent() {

		mainFrame.getListeClients().addActionListener(
				(event -> FichierClient.lireFichierClient()));

		mainFrame.getDevis().addActionListener((event -> goToFenetreSaisieInfos()));

	}

	public void goToFenetreSaisieInfos() {

		mainFrameDispose();
		new FenetreSaisieInfos();

	}

	public void showFrame() {

		mainFrame.show();

	}

	public void mainFrameDispose() {

		mainFrame.getFenetrePrincipal().dispose(); // Ferme la fenetre.

	}

}
