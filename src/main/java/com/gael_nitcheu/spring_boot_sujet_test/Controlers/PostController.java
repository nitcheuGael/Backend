package com.gael_nitcheu.spring_boot_sujet_test.Controlers;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Post;
import com.gael_nitcheu.spring_boot_sujet_test.Service.PostService;

@CrossOrigin("http://localhost:3000")
@RestController
public class PostController {
    @Autowired
    private PostService postServ;

    // ADD POSTE
    @RequestMapping(method = RequestMethod.POST, value = "/add_poste")

    public void add_poste(@RequestBody Post post) {
        postServ.creer_poste(post);
    }

    // DELETE POSTE
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete_poste")

    public void delete_poste(@RequestBody String poste, @RequestBody Date datePost) {
        long id = postServ.get_id_post(poste, datePost);
        postServ.delet_post(id);
    }

    // UPDATE POSTE
    @RequestMapping(method = RequestMethod.PUT, value = "/update_poste/{id}")

    public void update_poste(@RequestBody Post post, @PathVariable long id) {
        postServ.update_poste(post, id);
    }

    // GET ID
    @RequestMapping(method = RequestMethod.GET, value = "/get_id_poste")

    public long get_id_poste(@RequestBody String poste, @RequestBody Date datePost) {

        return postServ.get_id_post(poste, datePost);
    }

    // LISTE POSTE D'ID
    @RequestMapping(method = RequestMethod.GET, value = "/list_post/{email}")

    public List<Post> list_post(@PathVariable String email) {
        return postServ.liste_poste(email);
    }

}
