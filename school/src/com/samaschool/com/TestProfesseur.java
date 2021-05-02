package com.samaschool.com;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TestProfesseur {

    public  static void  main(String[] args)
    {
        //Importation de Scanner pour recuperer la saisie du user
        Scanner s= new Scanner(System.in);

        System.out.println("Veuillez entrer le nombre de professeur à ajouter:");
        int nombre =s.nextInt();
        OperationProfesseur opt= new OperationProfesseur(nombre);

        //Debut Instruction pour ajouter un prof  à l'array
        System.out.println("Entrer les infos du professeur: ");
        for (int i=0; i<nombre; i++)
        {
            Professeur p1= new Professeur();
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
            String matricule ="ET" + dtf.format(now) + ID;
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
            System.out.println("Entrer la specialite:");
            String specialite =s.next();


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
        String text="";
        Professeur pr=null;
        do {
            System.out.println("1- Ajouter un professeur");
            System.out.println("2- Modifier un professeur");
            System.out.println("3- Voir les détails d'un professeur");
            System.out.println("4- Supprimer un professeur");
            System.out.println("5- Afficher tous les profs");
            System.out.println("6- Quitter");
            System.out.println("Faite votre choix : - ");
            int choix = s.nextInt();
            switch (choix)
            {
                case 1:
                    break;
                case 2:
                    System.out.println("Entrer l'id du professeur à modifier: -");
                    int idProf = s.nextInt();
                    opt.AjouterProfesseur();
                    break;
                case 3:
                    System.out.println("Mettrer l'id du prof à afficher");
                    int idprof = s.nextInt();
                    opt.afficherProfesseur();
                    break;
                case 4:
                    System.out.println("Mettrer l'id du prof à supprimer");
                    if (opt.supprimerEtudiant(s.nextInt()))
                    {
                        System.out.println("Suppression réussie !!");
                    }else{
                        System.out.println("Cet professeur est introuvable");
                    }
                    break;
                case 5:
                    opt.afficherProfesseur();
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
