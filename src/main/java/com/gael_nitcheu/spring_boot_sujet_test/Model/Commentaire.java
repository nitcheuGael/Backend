package com.gael_nitcheu.spring_boot_sujet_test.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private long idPoste;
    private String commentaire;
    private String emailCommenteuer;

    private Date dateHeurComment;

    public Commentaire() {
    }

    public Commentaire(long idPoste, String commentaire, String emailCommenteuer, Date dateHeurComment) {

        this.idPoste = idPoste;
        this.commentaire = commentaire;
        this.emailCommenteuer = emailCommenteuer;
        this.dateHeurComment = dateHeurComment;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPoste() {
        return this.idPoste;
    }

    public void setIdPoste(long idPoste) {
        this.idPoste = idPoste;
    }

    public String getCommentaire() {
        return this.commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getDateHeurComment() {
        return this.dateHeurComment;
    }

    public void setDateHeurComment(Date dateHeurComment) {
        this.dateHeurComment = dateHeurComment;
    }

    public String getEmailCommenteuer() {
        return this.emailCommenteuer;
    }

    public void setEmailCommenteuer(String emailCommenteuer) {
        this.emailCommenteuer = emailCommenteuer;
    }

}
