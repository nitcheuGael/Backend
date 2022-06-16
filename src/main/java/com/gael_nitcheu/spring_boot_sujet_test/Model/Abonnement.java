package com.gael_nitcheu.spring_boot_sujet_test.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String follo;
    private String follower;

    public Abonnement() {
    }

    public Abonnement(String follo, String follower) {

        this.follo = follo;
        this.follower = follower;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFollo() {
        return this.follo;
    }

    public void setFollo(String follo) {
        this.follo = follo;
    }

    public String getFollower() {
        return this.follower;
    }

    public void setFollower(String follower) {
        this.follower = follower;
    }

}
