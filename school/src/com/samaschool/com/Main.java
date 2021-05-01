package com.samaschool.com;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;



public class Main {

    public static void main(String[] args) {
        time();
        menuPrincipal();

    }

    //Fonction d'affichage du menu
    public static  void menuPrincipal()
    {
        System.out.println("******************************************************************");
        System.out.println("******************************************************************");
        System.out.println("---- * ------- * 1- Gestion Groupe             ---- * ------- * --");
        System.out.println("---- * ------- * 2- Gestion Etudiant           ---- * ------- * --");
        System.out.println("---- * ------- * 3- Gestion Professeurs        ---- * ------- * --");
        System.out.println("---- * ------- * 4- Gestion Groupe-Etudiant    ---- * ------- * --");
        System.out.println("---- * ------- * 5- Quitter                    ---- * ------- * --");
        System.out.println("---- * ------- * Faites votre choix: 5         ---- * ------- * --");
        System.out.println("******************************************************************");
        System.out.println("******************************************************************");
    }


    /**
     * Fonction de test pour voir je peux recevoir la date de la machine*/
    public static void time( ) {
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}

