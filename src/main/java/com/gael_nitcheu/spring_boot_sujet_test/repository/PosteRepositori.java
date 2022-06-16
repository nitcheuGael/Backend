package com.gael_nitcheu.spring_boot_sujet_test.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Post;

public interface PosteRepositori extends CrudRepository<Post, Long> {

    List<Post> findByPosteur(String posteur);

    String findAllByPosteAndDatePoste(String poste, Date datePoste);

    long findByPosteAndDatePoste(String poste, Date datePoste);

}
