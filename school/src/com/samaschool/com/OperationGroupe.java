package com.samaschool.com;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class OperationGroupe
{
    // Création de la table Groupe afin d'y mettre les infos du groupe
    private Groupe[] grp;
    private int index;

        OperationGroupe (int taille)
        {
            grp = new Groupe[taille];
        }


        public void ajoutGroupe(Groupe g)
        {
            grp[index++] = g;
        }


        public void afficherGroupe()
        {
            for (int i=0; i<grp.length; i++)
             {
                if (grp[i]!=null)
                {
                    System.out.println("================================================");
                    System.out.println("NOM DU GROUPE: " + grp[i].getNomGroupe());
                    System.out.println("DATE DE CREATION: "+ grp[i].getDateCreation());
                    System.out.println("NOM DU MODULE: "+grp[i].getModuleGroupe());
                }
             }
        }


        public Groupe rechercherGroupe(int id)
        {
            Groupe gr=null;
            for (int i=0; i<grp.length; i++)
            {
                if (grp[i]!=null)
                {
                    if (grp[i].getId()==id)
                    //if (grp[i].getNomGroupe().equals(name))
                    {
                        gr=grp[i];
                    }
                    System.out.println(grp[i].getNomGroupe());
                }
            }
            return gr;
        }

        public boolean supprimerGroupe(int id)
        {
            boolean etat = false;
            for (int i=0; i<grp.length; i++)
            {
                if (grp[i]!=null)
                {
                    if (grp[i].getId()==id)
                    {
                        grp[i]=null;
                        etat=true;
                    }
                }
            }
            return etat;
        }

        public  void ajouterGroupe()
        {
            Scanner s= new Scanner(System.in);

            System.out.println("Veuillez entrer le nombre de groupe à ajouter:");
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
        }

    public void modifierGroupe(int id)
    {
        for (int i=0; i<grp.length; i++)
        {
            if (grp[i]!=null)
            {
                if (grp[i].getId()==id)
                {
                    grp[i]=null;
                    ajouterGroupe();
                }
            }
        }

    }



}

