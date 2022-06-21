package com.damien.utils;

import com.damien.fenetres.FenetreSaisieInfos;

import static com.damien.entites.Personne.getAge;
import static com.damien.entites.Personne.getNbAccidents;

public class CalculPoints {

    private static int points;

    private CalculPoints() {
    }

    public static int calculPoints() {
        points = 0;
        if (getNbAccidents().equals("3+")) {
            points = -1;
        } else {
            if (getAge() >= 25) {
                points++;
            }

            if (FenetreSaisieInfos.getJeuneCond().equals("Non")) {
                points++;
            }
            points -= Integer.parseInt(getNbAccidents());
        }
        System.out.println("Nombre de points : " + points);
        return points;
    }
}
