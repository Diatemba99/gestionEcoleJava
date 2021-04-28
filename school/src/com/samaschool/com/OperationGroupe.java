package com.samaschool.com;

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
                    System.out.println(grp[i].getNomGroupe());
                    System.out.println(grp[i].getDateCreation());
                    System.out.println(grp[i].getModuleGroupe());
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


}
