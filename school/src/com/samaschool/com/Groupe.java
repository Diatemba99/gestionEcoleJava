package com.samaschool.com;

import java.util.Date;

public class Groupe {

    private String nomGroupe;
    private int id;
    private String moduleGroupe;
    private String dateCreation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    //------------------------------------------------
    //-------- Debut Getters et Setters
    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public String getModuleGroupe() {
        return moduleGroupe;
    }

    public void setModuleGroupe(String moduleGroupe) {
        this.moduleGroupe = moduleGroupe;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }


}
//nom, Date, ModuleGroupe