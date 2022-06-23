package com.damien.utils;

import com.damien.entites.Personne;
import com.damien.fenetres.FenetreSaisieInfos;

/**
 * The type Calcul points.
 */
public class CalculPoints {


    private CalculPoints() {
    }

    /**
     * Calcul points int.
     *
     * @param personne the personne
     * @return the int
     */
    public static int calculPoints(Personne personne) {
        int points = 0;
        if (personne.getNbAccidents().equals("3+")) {
            points = -1;
        } else {
            if (personne.getAge() >= 25) {
                points++;
            }

            if (FenetreSaisieInfos.getJeuneCond().equals("Non")) {
                points++;
            }
            points -= Integer.parseInt(personne.getNbAccidents());
        }
        return points;
    }
}
