package com.samaschool.com;

public class Main {

    public static void main(String[] args) {
        menuPrincipal();
        menuGestionGroupe();

    }

    public static  void menuPrincipal()
    {
        System.out.println("************************************");
        System.out.println("1- Gestion Groupe ");
        System.out.println("2- Gestion Etudiant");
        System.out.println("3- Gestion Professeurs");
        System.out.println("4- Gestion Groupe-Etudiant");
        System.out.println("5- Quitter");
        System.out.println("************************************");
    }

    public static  void menuGestionGroupe()
    {
        System.out.println("************************************");
        System.out.println("1- Créer groupe ");
        System.out.println("2- Modifier un  groupe");
        System.out.println("3- Voir les détails d'un groupe");
        System.out.println("4- Supprimer un groupe");
        System.out.println("5- Afficher tout les groupes");
        System.out.println("6- Quitter");
        System.out.println("************************************");
    }
}
