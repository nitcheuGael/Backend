package com.gael_nitcheu.spring_boot_sujet_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Abonnement;

import java.util.List;

public interface AbonnementRepositori extends JpaRepository<Abonnement, Long> {

    List<Abonnement> findByfollo(String follo);

    List<Abonnement> findAllByFollower(String follower);

    long findByFollower(String follower);

}
