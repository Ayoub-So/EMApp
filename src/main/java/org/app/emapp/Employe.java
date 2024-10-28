package org.app.emapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employe {

    @Id
    private String id;
    private String nom;


    public Employe(String id, String nom, String num) {
        this.id = id;
        this.nom = nom;
    }

    public Employe() {

    }

    public String getNom() {
        return nom;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
