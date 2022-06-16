package com.gael_nitcheu.spring_boot_sujet_test.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long idPoste;
    private String emailLiker;

    public Like() {
    }

    public Like(long idPoste, String emailLiker) {
        this.idPoste = idPoste;
        this.emailLiker = emailLiker;
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

    public String getEmailLiker() {
        return this.emailLiker;
    }

    public void setEmailLiker(String emailLiker) {
        this.emailLiker = emailLiker;
    }

}
