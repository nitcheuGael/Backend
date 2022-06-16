package com.gael_nitcheu.spring_boot_sujet_test.Controlers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Commentaire;
import com.gael_nitcheu.spring_boot_sujet_test.Service.CommentaireService;

@CrossOrigin("http://localhost:3000")
@RestController
public class CommentaireControler {
    @Autowired
    private CommentaireService commentairSer;

    // ADD COMMENTAIRE
    @RequestMapping(method = RequestMethod.POST, value = "/add_commentaire")

    public void add_commentaire(@RequestBody Commentaire commentaire) {
        commentairSer.ecrire_commentaire(commentaire);
    }

    // DELETE COMMENTAIRE
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete_commentaire")

    public void delete_commentaire(String mailCommenteuer, Date dateHeurComment) {
        commentairSer.delete_commentaire(mailCommenteuer, dateHeurComment);
    }

    // LIST COMMENTAIRE
    @RequestMapping(method = RequestMethod.GET, value = "/list_commentaire")

    public List<Commentaire> list_commentaire(String mailCommenteuer, Date dateHeurComment) {
        Long idCommentaire = commentairSer.get_id_Commentaire(mailCommenteuer, dateHeurComment);
        return commentairSer.list_commentaire(idCommentaire);
    }

}
