package com.gael_nitcheu.spring_boot_sujet_test.Controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Abonnement;
import com.gael_nitcheu.spring_boot_sujet_test.Service.AbonnementService;

@CrossOrigin("http://localhost:3000")
@RestController
public class AbonnerController {
    @Autowired
    private AbonnementService abonnerSer;

    // ADD
    @RequestMapping(method = RequestMethod.POST, value = "/add_Abonner")
    public void add_Abonner(@RequestBody Abonnement abonnement) {

        abonnerSer.sabonnement(abonnement);

    }

    // DESABONEMENT DONC DELETE
    @RequestMapping(method = RequestMethod.DELETE, value = "/desabonner")
    public void desabonner(@RequestBody String emailFollower) {
        abonnerSer.desabonnement(emailFollower);
    }

    // LISTE DES ABONNES D'UN ABONNEER
    @RequestMapping(method = RequestMethod.GET, value = "/liste_abonner")
    public List<Abonnement> liste_abonner(@RequestBody String emailFollo) {
        return abonnerSer.liste_des_abonner(emailFollo);
    }

}
