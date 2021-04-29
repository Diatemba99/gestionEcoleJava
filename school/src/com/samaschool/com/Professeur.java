package com.samaschool.com;

/**
 * La classe Professeur Hérite de la classe Personne
 * **/


public class Professeur extends Personne  {
    private String specialite;

    public Professeur ()
    {
        super();
    }
    //Constructeur de la classe Etudiant avec parametre
    public Professeur (int ID,String prenom,String nom,
                       String adresse,String matricule,
                       String nationalite,String dateNaissance,
                       String lieuNaissance,String telephone,
                       String email,String genre,
                       String situationMatrimoniale, String specialite)
    {
        super(ID, prenom,nom,adresse,matricule,nationalite,dateNaissance,lieuNaissance, telephone,
                email,genre, situationMatrimoniale);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}




