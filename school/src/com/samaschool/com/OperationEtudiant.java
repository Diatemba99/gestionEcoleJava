package com.samaschool.com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class OperationEtudiant {
    Scanner s= new Scanner(System.in);


    // Création de la table etudiant afin d'y mettre les infos de l'etudiant
    private Etudiant[] etu;
    private int index;

    OperationEtudiant (int taille)
    {
        etu = new Etudiant[taille];
    }

    //Cette fonction permet d'ajouter un etudiant au Array Etudiant[]
    public void ajoutEtudiant(Etudiant e)
    {
        etu[index++] = e;
    }


    //Cette fonction permet d'afficher tout les étudiants de la classe Etudiant se trouvant dans l'Array
    public void afficherEtudiant()
    {
        for (int i=0; i<etu.length; i++)
        {
            if (etu[i]!=null)
            {
                System.out.println("================================================");
                System.out.println("Adresse: " + etu[i].getAdresse());
                System.out.println("DATE de naissance: "+ etu[i].getDateNaissance());
                System.out.println("Nom: "+etu[i].getNom());
                System.out.println("Prenom: "+etu[i].getPrenom());
                System.out.println("Email: "+etu[i].getEmail());
                System.out.println("Genre: "+etu[i].getGenre());
                System.out.println("Lieu de Naissance: "+etu[i].getLieuNaissance());
                System.out.println("Matricule: "+etu[i].getMatricule());
                System.out.println("Situation Matrimoniale: "+etu[i].getSituationMatrimoniale());
                System.out.println("Téléphone: "+etu[i].getTelephone());
                System.out.println("ID: "+etu[i].getID());
            }
        }
    }

    //Fonction pour modifier les informations d'un Etudiant
    public boolean modifierEtudiant(int id)
    {
            boolean etat = false;
            for (int i=0; i<etu.length; i++)
            {
                if (etu[i]!=null)
                {
                    if (etu[i].getID()==id)
                    {
                        etu[i]=null;
                        ajouterEtudiants();
                        etat=true;
                    }
                }
            }
            return etat;

    }


    //Fonction pour rechercher un etudiant dans l'Array
    public Etudiant rechercherEtudiant(int id)
    {
        Etudiant et=null;
        for (int i=0; i<etu.length; i++)
        {
            if (etu[i]!=null)
            {
                if (etu[i].getID()==id)
                {
                    et=etu[i];
                }
                System.out.println(etu[i].getPrenom() + etu[i].getNom());
            }
        }
        return et;
    }


    //Fonction pour supprimer un etudiant dans l'Array
    public boolean supprimerEtudiant(int id)
    {
        boolean etat = false;
        for (int i=0; i<etu.length; i++)
        {
            if (etu[i]!=null)
            {
                if (etu[i].getID()==id)
                {
                    etu[i]=null;
                    etat=true;
                }
            }
        }
        return etat;
    }



    //Fonction pour afficher un etudiant dans l'Array
    public void afficherUnEtudiant()
    {
        for (int i=0; i<etu.length; i++)
        {
            System.out.println(etu[i]);
        }
    }



    public void  ajouterEtudiants()
    {
        System.out.println("Veuillez entrer le nombre d'étudiant à ajouter:");
        Scanner s = new Scanner(System.in);
        int nombre =s.nextInt();
        OperationEtudiant opt= new OperationEtudiant(nombre);

        //Debut Instruction pour ajouter un etudiant  à l'array
        System.out.println("Entrer les infos de l'etudiant: ");
        for (int i=0; i<nombre; i++)
        {
            Etudiant e1= new Etudiant();
            System.out.println("Entrer l'ID:");
            int ID =s.nextInt();
            System.out.println("Entrer le prenom:");
            String prenom =s.next();
            System.out.println("Entrer le nom:");
            String nom =s.next();
            System.out.println("Entrer l'adresse:");
            String adresse =s.next();
            //GENERER MATRICULE
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyMMd");
            LocalDateTime now = LocalDateTime.now();
            String matricule =dtf.format(now) + ID;
            System.out.println("Entrer la nationalite:");
            String nationalite =s.next();
            System.out.println("Entrer la date de naissance ex:[22/04/1964]:");
            String dateNaissance =s.next();
            System.out.println("Entrer le lieu de Naissance:");
            String lieuNaissance =s.next();
            System.out.println("Entrer le numéro:");
            String telephone =s.next();
            System.out.println("Entrer l'email:");
            String email =s.next();
            System.out.println("Entrer le genre:");
            String genre =s.next();
            System.out.println("Entrer la situation matrimoniale:");
            String situationMatrimoniale =s.next();
            //------------------------------------------------------------


            //mettre les valeurs saisies dans chaque propriete de la classe
            e1.setID(ID);
            e1.setPrenom(prenom);
            e1.setNom(nom);
            e1.setAdresse(adresse);
            e1.setMatricule(matricule);
            e1.setNationalite(nationalite);
            e1.setDateNaissance(dateNaissance);
            e1.setLieuNaissance(lieuNaissance);
            e1.setTelephone(telephone);
            e1.setEmail(email);
            e1.setGenre(genre);
            e1.setSituationMatrimoniale(situationMatrimoniale);
            //ajout groupe
            opt.ajoutEtudiant(e1);
        }
    }
}
