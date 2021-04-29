package com.samaschool.com;

/**
 * La classe Etudiant Hérite de la classe Personne
 * **/

public class Etudiant extends Personne  {

    //Constructeur de la classe Personne
    public Etudiant(int ID, String prenom, String nom, String adresse, String matricule, String nationalite, String dateNaissance,
                    String lieuNaissance, String telephone, String email, String genre, String situationMatrimoniale)
        {
        super(ID, prenom, nom, adresse, matricule, nationalite, dateNaissance,
                lieuNaissance, telephone, email, genre, situationMatrimoniale);
        }

    public Etudiant() {

    }
}
