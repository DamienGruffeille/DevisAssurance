package com.damien.fenetres;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Fenetre erreur.
 */
public class FenetreErreur extends JFrame implements ActionListener {
    /**
     * The Btn ok.
     */
    private final JButton btnOK = new JButton("OK");
    /**
     * The Frame Width.
     */
    private static final int FRAME_WIDTH = 250;
    /**
     * The Frame Heigth.
     */
    private static final int FRAME_HEIGTH = 150;

    /**
     * Instantiates a new Fenetre erreur.
     *
     * @param message the message
     */
    public FenetreErreur(final String message) {
        JLabel info = new JLabel(message);

        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();

        btnOK.addActionListener(this);

        pan1.add(info);
        pan2.add(btnOK);

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
    public final void actionPerformed(final ActionEvent e) {
        if (e.getSource() == btnOK) {
            this.dispose();
        }
    }
}
