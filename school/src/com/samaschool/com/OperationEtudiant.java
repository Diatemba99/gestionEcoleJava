package com.samaschool.com;

public class OperationEtudiant {

    // Création de la table etudiant afin d'y mettre les infos de l'etudiant
    private Etudiant[] etu;
    private int index;

    OperationEtudiant (int taille)
    {
        etu = new Etudiant[taille];
    }


    public void ajoutEtudiant(Etudiant e)
    {
        etu[index++] = e;
    }


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
                System.out.println("Classe: "+etu[i].getClass());
            }
        }
    }
    public static void modifierGroupe()
    {

    }

    public Etudiant rechercherEtudiant(int id)
    {
        Etudiant et=null;
        for (int i=0; i<etu.length; i++)
        {
            if (etu[i]!=null)
            {
                if (etu[i].getID()==id)
                //if (grp[i].getNomGroupe().equals(name))
                {
                    et=etu[i];
                }
                System.out.println(etu[i].getPrenom() + etu[i].getNom());
            }
        }
        return et;
    }

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
                //System.out.println(grp[i].getNomGroupe());
            }
        }
        return etat;
    }
}
