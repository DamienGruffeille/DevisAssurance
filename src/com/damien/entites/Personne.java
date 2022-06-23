package com.damien.entites;

/**
 * The type Personne.
 */
public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String jeuneCond;
    private String nbAccidents;
    private String fidelite;

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
    public void setStatut(String statut) {
        this.statut = statut;
    }

    private String statut = "Prospect";

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
    public Personne(String nom, String prenom, int age, String jeuneCond, String nbAccidents, String bonusFid, String statut) {
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
    public Personne(String nom, String prenom, int age, String jeuneCond, String nbAccidents, String fidelite) {
        setNom(nom);
        setPrenom(prenom);
        this.age = age;
        this.jeuneCond = jeuneCond;
        this.nbAccidents = nbAccidents;
        this.fidelite = fidelite;
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
    public void setNom(String nom) {
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
    public void setPrenom(String prenom) {
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
    public void setAge(int age) {
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
    public void setJeunecond(String jeuneCond) {
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
    public void setNbAccidents(String nbAccidents) {
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
    public void setFidelite(String fidelite) {
        this.fidelite = fidelite;
    }
}
