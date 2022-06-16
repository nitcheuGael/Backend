package com.gael_nitcheu.spring_boot_sujet_test.Service;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gael_nitcheu.spring_boot_sujet_test.Model.Post;
import com.gael_nitcheu.spring_boot_sujet_test.repository.CommentaireRepositori;
import com.gael_nitcheu.spring_boot_sujet_test.repository.LikeRepositoti;
import com.gael_nitcheu.spring_boot_sujet_test.repository.PosteRepositori;

@Service
public class PostService {
    @Autowired
    private PosteRepositori postRep;
    @Autowired
    private LikeRepositoti like;
    @Autowired
    private CommentaireRepositori comment;

    public void creer_poste(Post post) {
        postRep.save(post);
    }

    public void update_poste(Post post, long id) {
        postRep.save(post);
    }

    public void delet_post(long id) {
        postRep.deleteById(id);
    }

    public List<Post> liste_poste(String email) {
        return postRep.findByPosteur(email);
    }

    public String get_post_by_poste(String poste, Date datePoste) {

        return postRep.findAllByPosteAndDatePoste(poste, datePoste);
    }

    public void delet_poste(String poste, Date datePoste) {
        long idpost = postRep.findByPosteAndDatePoste(poste, datePoste);

        postRep.deleteById(idpost);
        like.deleteById(like.findByIdPoste(idpost));
        comment.deleteById(comment.findByIdPoste(idpost));

    }

    public long get_id_post(String poste, Date datePoste) {

        return postRep.findByPosteAndDatePoste(poste, datePoste);

    }

}
