package com.gael_nitcheu.spring_boot_sujet_test.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Commentaire;
import com.gael_nitcheu.spring_boot_sujet_test.repository.CommentaireRepositori;

@Service
public class CommentaireService {
    @Autowired
    private CommentaireRepositori commentaireRep;

    /*
     * Ici je caste email du commentatateur avec id du commentaire
     * 
     * 
     */

    public void ecrire_commentaire(Commentaire commentaire) {
        commentaireRep.save(commentaire);
    }

    public void delete_commentaire(String mailCommenteuer, Date dateHeurComment) {
        commentaireRep.deleteById(
                commentaireRep.findByEmailCommenteuerAndDateHeurComment(mailCommenteuer, dateHeurComment));
    }

    public Commentaire update_commmentaire(Commentaire commentaireup, long id) {
        return commentaireRep.save(commentaireup);
    }

    public long get_id_Commentaire(String mailCommenteuer, Date dateHeurComment) {
        return commentaireRep.findByEmailCommenteuerAndDateHeurComment(mailCommenteuer, dateHeurComment);
    }

    public List<Commentaire> list_commentaire(long idPoste) {
        return commentaireRep.findAllByIdPoste(idPoste);

    }
}
