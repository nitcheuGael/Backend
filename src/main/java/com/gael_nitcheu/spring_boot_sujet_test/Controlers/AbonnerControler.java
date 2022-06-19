package com.gael_nitcheu.spring_boot_sujet_test.Controlers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Abonner;
import com.gael_nitcheu.spring_boot_sujet_test.Service.AbonnerServive;




@CrossOrigin(origins = { "*" },

        allowCredentials = "false", allowedHeaders = { "*" }, exposedHeaders = { "*" }, methods = {
                RequestMethod.GET,
                RequestMethod.DELETE,
                RequestMethod.POST,
                RequestMethod.PUT
        })
@RestController
public class AbonnerControler {
    @Autowired
    private AbonnerServive abonnerService;

    // ADD Product

    @RequestMapping(method = RequestMethod.POST, value = "/add_abonner")
    public void add_poste(@RequestBody Abonner abonne) {
        abonnerService.add_abonner(abonne);
    }

    // UPDATE Product
    @RequestMapping(method = RequestMethod.PUT, value = "/update_abonner/{email}")
    public void update_poste(@RequestBody Abonner abonner, @PathVariable("email") String email) {
        abonnerService.update_abonner(abonner, email);
    }



    // PRODUIT EXISTE
    @RequestMapping(method = RequestMethod.GET, value = "/abonner_exist/{email}")
    public boolean lienExist(@PathVariable("email") String email) {
        return abonnerService.existe_abonner(email);
    }

}
