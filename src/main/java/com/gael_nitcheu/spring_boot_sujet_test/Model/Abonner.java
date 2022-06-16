package com.gael_nitcheu.spring_boot_sujet_test.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "abonner")
public class Abonner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String email;
    private String nom;
    private String photo;
    private String headline;
    private String website;

    public Abonner(String email, String nom, String photo, String headline, String website) {

        this.email = email;
        this.nom = nom;
        this.photo = photo;
        this.headline = headline;
        this.website = website;
    }

    public Abonner() {
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHeadline() {
        return this.headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
