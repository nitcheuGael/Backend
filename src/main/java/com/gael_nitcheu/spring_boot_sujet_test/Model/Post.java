package com.gael_nitcheu.spring_boot_sujet_test.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String poste;
    private String posteur;
    private String idCommenteure;
    private Date datePoste;

    public Post() {
    }

    public Post(String poste, String posteur, String idCommenteure, Date datePoste) {

        this.poste = poste;
        this.posteur = posteur;
        this.idCommenteure = idCommenteure;
        this.datePoste = datePoste;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoste() {
        return this.poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public String getPosteur() {
        return this.posteur;
    }

    public void setPosteur(String posteur) {
        this.posteur = posteur;
    }

    public String getIdCommenteure() {
        return this.idCommenteure;
    }

    public void setIdCommenteure(String idCommenteure) {
        this.idCommenteure = idCommenteure;
    }

    public Date getDatePoste() {
        return this.datePoste;
    }

    public void setDatePoste(Date datePoste) {
        this.datePoste = datePoste;
    }

}