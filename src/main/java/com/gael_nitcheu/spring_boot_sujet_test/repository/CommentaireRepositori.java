package com.gael_nitcheu.spring_boot_sujet_test.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Commentaire;

public interface CommentaireRepositori extends CrudRepository<Commentaire, Long> {

    // ceci c'est supprimer les commentaires quand le poste est supprimer

    long findByIdPoste(long idPoste);

    long findByEmailCommenteuerAndDateHeurComment(String mailCommenteuer, Date dateHeurComment);

    List<Commentaire> findAllByIdPoste(long idPoste);

}
