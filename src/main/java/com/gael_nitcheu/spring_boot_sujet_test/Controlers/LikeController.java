package com.gael_nitcheu.spring_boot_sujet_test.Controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Like;
import com.gael_nitcheu.spring_boot_sujet_test.Service.likeSercice;

@CrossOrigin("http://localhost:3000")
@RestController
public class LikeController {
    @Autowired
    private likeSercice likeserv;

    // ADD LIKE
    @RequestMapping(method = RequestMethod.POST, value = "/add_like")

    public void add_like(@RequestBody Like like) {
        likeserv.add_like(like);
    }

    // DELETE LIKE
    @RequestMapping(method = RequestMethod.DELETE, value = "/delete_like")

    public void delete_like(String email) {
        // likeserv.delet_like(emailSubstring, idPostStringFromEmail);
    }

}
