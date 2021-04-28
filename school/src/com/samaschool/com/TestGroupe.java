package com.samaschool.com;


import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class TestGroupe
{
    public  static void  main(String[] args)
    {
        Scanner s= new Scanner(System.in);

        System.out.println("Veuillez entrer le nombre de groupe à ajouter:");
        int nombre =s.nextInt();
        OperationGroupe opt= new OperationGroupe(nombre);

        addGroupe:
        System.out.println("Entrer les infos du groupe: ");
        for (int i=0; i<nombre; i++)
            {
                Groupe g1= new Groupe();
                System.out.println("Entrer le nom du  groupe:");
                String nomGroupe =s.next();
                System.out.println("Entrer le nom du  module:");
                String moduleGroupe =s.next();
                //------------------------------------------------------------
                //Ce code permet de générer de façon automatique la date
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDateTime now = LocalDateTime.now();
                String dateCreation =dtf.format(now);


                System.out.println("Entrer l'ID du  groupe:");
                int id =s.nextInt();

                g1.setNomGroupe(nomGroupe);
                g1.setDateCreation(dateCreation);
                g1.setId(id);
                g1.setModuleGroupe(moduleGroupe);
                //ajout groupe
                opt.ajoutGroupe(g1);
            }
        String text="";
        Groupe gp=null;
        do {
                System.out.println("1- Créer un Groupe");
                System.out.println("2- Modifier un Groupe");
                System.out.println("3- Voir les détails d'un groupe");
                System.out.println("4- Supprimer un groupe");
                System.out.println("5- Afficher tous les groupes");
                System.out.println("6- Quitter");
                System.out.println("Faite votre choix : - ");
                int choix = s.nextInt();
                    switch (choix)
                    {
                        case 1:
                            break;
                        case 2:


                            break;
                        case 3:
                            System.out.println("Entrer l'id du groupe à chercher: -");
                            gp = opt.rechercherGroupe(s.nextInt());
                            if (gp!=null)
                            {
                                System.out.println(gp.getNomGroupe());
                            }else{
                                System.out.println("Ce groupe n'hesiste pas");
                            }
                        case 4:
                            System.out.println("Mettrer l'id du groupe à supprimer");
                            if (opt.supprimerGroupe(s.nextInt()))
                            {
                                System.out.println("Suppression réussie !!");
                            }else{
                                System.out.println("Ce groupe est introuvable");
                            }
                            break;
                        case 5:
                            opt.afficherGroupe();
                            break;
                        case 6:

                            break;
                        default:System.out.println("Mauvais choix");
                    }
                    System.out.println("Voulez-vous continuer? o/n:-");
                    text=s.next();

            }while (text.equalsIgnoreCase("o"));
            System.out.println("Fin de code");
    }

}
