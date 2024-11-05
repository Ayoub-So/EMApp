package org.app.emapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Employe {

    @Id
    private String id;
    private String nom;


    public Employe(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Employe() {

    }


}
