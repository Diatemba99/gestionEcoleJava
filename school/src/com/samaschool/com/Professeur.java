package com.samaschool.com;

public class Professeur extends Personne  {
    private String specialite;

    public Professeur ()
    {
        super();
    }

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

}




