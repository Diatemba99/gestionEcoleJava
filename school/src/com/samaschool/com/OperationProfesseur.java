package com.samaschool.com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class OperationProfesseur {

    // Création de la table prof afin d'y mettre les infos de l'etudiant
    private Professeur[] prof;
    private int index;

    OperationProfesseur (int taille)
    {
        prof = new Professeur[taille];
    }


    public void ajoutProfesseur(Professeur p)
    {
        prof[index++] = p;
    }


    public void afficherProfesseur()
    {
        for (int i=0; i<prof.length; i++)
        {
            if (prof[i]!=null)
            {
                System.out.println("================================================");
                System.out.println("Adresse: " + prof[i].getAdresse());
                System.out.println("DATE de naissance: "+ prof[i].getDateNaissance());
                System.out.println("Nom: "+prof[i].getNom());
                System.out.println("Prenom: "+prof[i].getPrenom());
                System.out.println("Email: "+prof[i].getEmail());
                System.out.println("Genre: "+prof[i].getGenre());
                System.out.println("Lieu de Naissance: "+prof[i].getLieuNaissance());
                System.out.println("Matricule: "+prof[i].getMatricule());
                System.out.println("Situation Matrimoniale: "+prof[i].getSituationMatrimoniale());
                System.out.println("Téléphone: "+prof[i].getTelephone());
                System.out.println("ID: "+prof[i].getID());
                System.out.println("Classe: "+prof[i].getClass());
                System.out.println("Specialite: "+prof[i].getSpecialite());
            }
        }
    }
    public static void modifierProfesseur()
    {

    }

    public Professeur rechercherProfesseur(int id)
    {
        Professeur pr=null;
        for (int i=0; i<prof.length; i++)
        {
            if (prof[i]!=null)
            {
                if (prof[i].getID()==id)
                {
                    pr=prof[i];
                }
                System.out.println(prof[i].getPrenom() + prof[i].getNom());
            }
        }
        return pr;
    }

    public boolean supprimerEtudiant(int id)
    {
        boolean etat = false;
        for (int i=0; i<prof.length; i++)
        {
            if (prof[i]!=null)
            {
                if (prof[i].getID()==id)
                {
                    prof[i]=null;
                    etat=true;
                }
            }
        }
        return etat;
    }



    public void afficherUnProfesseur()
    {
        for (int i=0; i<prof.length; i++)
        {
            if (prof[i]!=null)
            {
                    System.out.println(prof[i]);
            }
        }
    }

    public void AjouterProfesseur() {
        Scanner s = new Scanner(System.in);

        System.out.println("Veuillez entrer le nombre de professeur à ajouter:");
        int nombre = s.nextInt();
        OperationProfesseur opt = new OperationProfesseur(nombre);

        //Debut Instruction pour ajouter un prof  à l'array
        System.out.println("Entrer les infos du professeur: ");
        for (int i = 0; i < nombre; i++) {
            Professeur p1 = new Professeur();
            System.out.println("Entrer l'ID:");
            int ID = s.nextInt();
            System.out.println("Entrer le prenom:");
            String prenom = s.next();
            System.out.println("Entrer le nom:");
            String nom = s.next();
            System.out.println("Entrer l'adresse:");
            String adresse = s.next();
            //GENERER MATRICULE
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMd");
            LocalDateTime now = LocalDateTime.now();
            String matricule = "ET" + dtf.format(now) + ID;
            System.out.println("Entrer la nationalite:");
            String nationalite = s.next();
            System.out.println("Entrer la date de naissance ex:[22/04/1964]:");
            String dateNaissance = s.next();
            System.out.println("Entrer le lieu de Naissance:");
            String lieuNaissance = s.next();
            System.out.println("Entrer le numéro:");
            String telephone = s.next();
            System.out.println("Entrer l'email:");
            String email = s.next();
            System.out.println("Entrer le genre:");
            String genre = s.next();
            System.out.println("Entrer la situation matrimoniale:");
            String situationMatrimoniale = s.next();
            System.out.println("Entrer la specialite:");
            String specialite = s.next();


            p1.setID(ID);
            p1.setPrenom(prenom);
            p1.setNom(nom);
            p1.setAdresse(adresse);
            p1.setMatricule(matricule);
            p1.setNationalite(nationalite);
            p1.setDateNaissance(dateNaissance);
            p1.setLieuNaissance(lieuNaissance);
            p1.setTelephone(telephone);
            p1.setEmail(email);
            p1.setGenre(genre);
            p1.setSituationMatrimoniale(situationMatrimoniale);
            //ajout prof
            opt.ajoutProfesseur(p1);
        }
    }
}
