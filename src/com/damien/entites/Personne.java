package com.damien.entites;

public class Personne {
    private String nom;
    private String prenom;
    private int age;
    private String jeuneCond;
    private String nbAccidents;
    private String fidelite;

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    private String statut = "Prospect";

    private Personne() {
        throw new IllegalStateException("Utility Class");
    }

    public Personne(String nom, String prenom, int age, String jeuneCond, String nbAccidents, String bonusFid, String statut) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.jeuneCond = jeuneCond;
        this.nbAccidents = nbAccidents;
        this.fidelite = bonusFid;
        this.statut = statut;
    }

    public Personne(String nom, String prenom, int age, String jeuneCond, String nbAccidents, String fidelite) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.jeuneCond = jeuneCond;
        this.nbAccidents = nbAccidents;
        this.fidelite = fidelite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJeunecond() {
        return jeuneCond;
    }

    public void setJeunecond(String jeuneCond) {
        this.jeuneCond = jeuneCond;
    }

    public String getNbAccidents() {
        return nbAccidents;
    }

    public void setNbAccidents(String nbAccidents) {
        this.nbAccidents = nbAccidents;
    }

    public  String getFidelite() {
        return fidelite;
    }

    public void setFidelite(String fidelite) {
        this.fidelite = fidelite;
    }
}
