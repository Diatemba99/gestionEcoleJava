package com.samaschool.com;

import java.awt.*;
import java.util.Scanner;

public class TestGroupe
{
    public  static void  main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Veuillez entree le nombre de groupe à ajouter:");
        int nombre =s.nextInt();
        OperationGroupe opt= new OperationGroupe(nombre);

        System.out.println("Entrer les infos du groupe: ");
        for (int i=0; i<nombre; i++)
            {
                Groupe g1= new Groupe();
                System.out.println("Entrer le nom du  groupe:");
                String nomGroupe =s.next();
                System.out.println("Entrer le nom du  module:");
                String moduleGroupe =s.next();
                //------------------------------------------------------------
                //Get date and time, generate ID
                System.out.println("Entrer la date de création du  groupe:");
                String dateCreation =s.next();

                System.out.println("Entrer l'ID du  groupe:");
                int id =s.nextInt();

                g1.setNomGroupe(nomGroupe);
                g1.setDateCreation(dateCreation);
                g1.setId(id);
                g1.setModuleGroupe(moduleGroupe);
            }
        String text="";
        Groupe gp=null;
        do {
                System.out.println("1- Rechercher groupe");
                System.out.println("2- Rechercher groupe");
                System.out.println("3- Afficher  groupe");
                System.out.println("Faite votre choix : - ");
                int choix = s.nextInt();
                    switch (choix)
                    {
                        case 1:
                            System.out.println("Entrer l'id du groupe à chercher: -");
                             gp = opt.rechercherGroupe(s.nextInt());
                            if (gp!=null)
                            {
                                System.out.println(gp.getNomGroupe());
                            }else{
                                System.out.println("Ce groupe n'hesiste pas");
                            }
                            break;
                        case 2:
                            break;
                        case 3:
                            gp.afficherGroupe();
                        default:System.out.println("Mauvais choix");
                    }
                    System.out.println("Voulez-vous continuer? o/n:-");
                    text=s.next();

            }while (text.equalsIgnoreCase("o"));
            System.out.println("Fin de code");
    }

}
