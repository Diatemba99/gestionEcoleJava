package com.samaschool.com;

public class Etudiant extends Personne  {


    public Etudiant(int ID, String prenom, String nom, String adresse, String matricule, String nationalite, String dateNaissance,
                    String lieuNaissance, String telephone, String email, String genre, String situationMatrimoniale)
        {
        super(ID, prenom, nom, adresse, matricule, nationalite, dateNaissance,
                lieuNaissance, telephone, email, genre, situationMatrimoniale);
        }

    public Etudiant() {

    }
}
