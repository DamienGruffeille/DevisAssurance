package com.damien.entites;

public class Personne {
    private static String nom;
    private static String prenom;
    private static int age;
    private static String jeuneCond;
    private static String nbAccidents;
    private static String fidelite;

    private Personne() {
        throw new IllegalStateException("Utility Class");
    }

    public Personne(String nom, String prenom, int age, String jeuneCond, String nbAccidents, String bonusFid) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.jeuneCond = jeuneCond;
        this.nbAccidents = nbAccidents;
        this.fidelite = bonusFid;
    }

    public static String getNom() {
        return nom;
    }

    public static void setNom(String nom) {
        Personne.nom = nom;
    }

    public static String getPrenom() {
        return prenom;
    }

    public static void setPrenom(String prenom) {
        Personne.prenom = prenom;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Personne.age = age;
    }

    public static String getJeunecond() {
        return jeuneCond;
    }

    public static void setJeunecond(String jeuneCond) {
        Personne.jeuneCond = jeuneCond;
    }

    public static String getNbAccidents() {
        return nbAccidents;
    }

    public static void setNbAccidents(String nbAccidents) {
        Personne.nbAccidents = nbAccidents;
    }

    public static String getFidelite() {
        return fidelite;
    }

    public static void setFidelite(String fidelite) {
        Personne.fidelite = fidelite;
    }
}
