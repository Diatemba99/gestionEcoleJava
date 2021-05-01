package com.samaschool.com;

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
}
