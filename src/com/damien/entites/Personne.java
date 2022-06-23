package com.damien.entites;

import java.io.Serializable;

/**
 * The type Personne.
 */
public class Personne implements Serializable {
    /**
     * Personne nom.
     */
    private String nom;
    /**
     * Personne prenom.
     */
    private String prenom;
    /**
     * Personne age.
     */
    private int age;
    /**
     * Personne jeunecond.
     */
    private String jeuneCond;
    /**
     * Personne nbAccidents.
     */
    private String nbAccidents;
    /**
     * Personne fidelite.
     */
    private String fidelite;
    /**
     * Personne statut.
     */
    private String statut = "Prospect";
    /**
     * Gets statut.
     *
     * @return the statut
     */
    public String getStatut() {
        return statut;
    }
    /**
     * Sets statut.
     *
     * @param statut the statut
     */
    public void setStatut(final String statut) {
        this.statut = statut;
    }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(final String nom) {
        this.nom = nom.trim().toUpperCase();
    }

    /**
     * Gets prenom.
     *
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Sets prenom.
     *
     * @param prenom the prenom
     */
    public void setPrenom(final String prenom) {
        this.prenom = prenom.trim().toUpperCase();
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(final int age) {
        this.age = age;
    }

    /**
     * Gets jeunecond.
     *
     * @return the jeunecond
     */
    public String getJeunecond() {
        return jeuneCond;
    }

    /**
     * Sets jeunecond.
     *
     * @param jeuneCond the jeune cond
     */
    public void setJeunecond(final String jeuneCond) {
        this.jeuneCond = jeuneCond;
    }

    /**
     * Gets nb accidents.
     *
     * @return the nb accidents
     */
    public String getNbAccidents() {
        return nbAccidents;
    }

    /**
     * Sets nb accidents.
     *
     * @param nbAccidents the nb accidents
     */
    public void setNbAccidents(final String nbAccidents) {
        this.nbAccidents = nbAccidents;
    }

    /**
     * Gets fidelite.
     *
     * @return the fidelite
     */
    public  String getFidelite() {
        return fidelite;
    }

    /**
     * Sets fidelite.
     *
     * @param fidelite the fidelite
     */
    public void setFidelite(final String fidelite) {
        this.fidelite = fidelite;
    }

    private Personne() {
        throw new IllegalStateException("Utility Class");
    }

    /**
     * Instantiates a new Personne.
     *
     * @param nom         the nom
     * @param prenom      the prenom
     * @param age         the age
     * @param jeuneCond   the jeune cond
     * @param nbAccidents the nb accidents
     * @param bonusFid    the bonus fid
     * @param statut      the statut
     */
    public Personne(final String nom,
                    final String prenom,
                    final int age,
                    final String jeuneCond,
                    final String nbAccidents,
                    final String bonusFid,
                    final String statut) {
        setNom(nom);
        setPrenom(prenom);
        this.age = age;
        this.jeuneCond = jeuneCond;
        this.nbAccidents = nbAccidents;
        this.fidelite = bonusFid;
        this.statut = statut;
    }

    /**
     * Instantiates a new Personne.
     *
     * @param nom         the nom
     * @param prenom      the prenom
     * @param age         the age
     * @param jeuneCond   the jeune cond
     * @param nbAccidents the nb accidents
     * @param fidelite    the fidelite
     */
    public Personne(final String nom,
                    final String prenom,
                    final int age,
                    final String jeuneCond,
                    final String nbAccidents,
                    final String fidelite) {
        setNom(nom);
        setPrenom(prenom);
        this.age = age;
        this.jeuneCond = jeuneCond;
        this.nbAccidents = nbAccidents;
        this.fidelite = fidelite;
    }
}
