package com.samaschool.com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestEtudiant {
    public  static void  main(String[] args)
    {
        //Importation de Scanner pour recuperer la saisie du user
        Scanner s= new Scanner(System.in);

        System.out.println("Veuillez entrer le nombre d'étudiant à ajouter:");
        int nombre =s.nextInt();
        OperationEtudiant opt= new OperationEtudiant(nombre);
        //opt.ajouterEtudiants();

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
        String text="";
        Etudiant etd=null;
        do {
            System.out.println("1- Ajouter un etudiant");
            System.out.println("2- Modifier un etudiant");
            System.out.println("3- Voir les détails d'un etudiant");
            System.out.println("4- Supprimer un etudiant");
            System.out.println("5- Afficher tous les etudiants");
            System.out.println("6- Quitter");
            System.out.println("Faite votre choix : - ");
            int choix = s.nextInt();
            switch (choix)
            {
                case 1:
                    opt.ajouterEtudiants();
                    break;
                case 2:
                    System.out.println("Entrer l'id de l'etudiant à modifier: -");
                    int etudiantSaisi = s.nextInt();
                    opt.ajouterEtudiants();
                    System.out.println("Informations modifiées avec succes !");
                    break;
                case 3:
                    System.out.println("Mettrer l'id de l'étudiant à afficher");
                    int id = s.nextInt();
                    opt.afficherEtudiant();
                    break;
                case 4:
                    System.out.println("Mettrer l'id de l'étudiant à supprimer");
                    if (opt.supprimerEtudiant(s.nextInt()))
                    {
                        System.out.println("Suppression réussie !!");
                    }else{
                        System.out.println("Cet etudiant est introuvable");
                    }
                    break;
                case 5:
                    opt.afficherEtudiant();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:System.out.println("Mauvais choix");
            }
            System.out.println("Voulez-vous continuer? o/n:-");
            text=s.next();

        }while (text.equalsIgnoreCase("o"));
        System.out.println("Fin de code");
    }
}
