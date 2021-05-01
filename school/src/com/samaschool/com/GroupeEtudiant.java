package com.samaschool.com;

public class GroupeEtudiant {
    private int ID;
    private String nomGroupe;

    public GroupeEtudiant(int ID, String nomGroupe) {

        this.ID = ID;
        this.nomGroupe = nomGroupe;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }
}
