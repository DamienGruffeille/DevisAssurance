package com.damien.application;

import javax.swing.SwingUtilities;

import com.damien.controller.MainFrameController;
import com.damien.uicomponent.MainFrame;

/**
 * The type Main.
 */
public class Main {

	private static void run() {

		final MainFrameController mainFrameController = new MainFrameController(new MainFrame());

		mainFrameController.showFrame();

	}

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {

		// Convention Swing, afin d'éviter des problèmes quand on a plusieurs thread.

		SwingUtilities.invokeLater(() -> run());

	}
}
