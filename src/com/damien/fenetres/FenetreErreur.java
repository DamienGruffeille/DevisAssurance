package com.damien.fenetres;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreErreur extends JFrame implements ActionListener {
    JButton btnOK = new JButton("OK");

    public FenetreErreur(String message) {
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
        this.setSize(250, 150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOK) {
            this.dispose();
        }
    }
}
