package com.gael_nitcheu.spring_boot_sujet_test.Controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Product;
import com.gael_nitcheu.spring_boot_sujet_test.Service.ProductService;

@CrossOrigin(origins = { "*" },

        allowCredentials = "false", allowedHeaders = { "*" }, exposedHeaders = { "*" }, methods = {
                RequestMethod.GET,
                RequestMethod.DELETE,
                RequestMethod.POST,
                RequestMethod.PUT
        })

@RestController
public class ProductController {

    @Autowired
    private ProductService productServ;

    // ADD Product

    @RequestMapping(method = RequestMethod.POST, value = "/add_product")
    public void add_poste(@RequestBody Product product) {
        productServ.creer_product(product);
    }

    // UPDATE Product
    @RequestMapping(method = RequestMethod.PUT, value = "/update_product/{id}")
    public void update_poste(@RequestBody Product product, @PathVariable("id") Long id) {
        productServ.update_product(product, id);
    }

    // LISTE Product byD'lien and email
    @RequestMapping(method = RequestMethod.GET, value = "/list_Product/{lienProduct}/{email}")
    public List<Product> list_post(@PathVariable("lienProduct") String lienProduct,@PathVariable("email") String email) {
        return productServ.liste_product(lienProduct,email);
    }

     // LISTE Product by email
     @RequestMapping(method = RequestMethod.GET, value = "/list_product_by_email/{email}")
     public List<Product> list_product_by_email(@PathVariable("email") String email) {
         return productServ.liste_product_byEmail(email);
     }

    // LISTE Product
    @RequestMapping(method = RequestMethod.GET, value = "/list_Product_all")
    public List<Product> list_post_all() {
        return productServ.liste_all_product();
    }

    // LISTE Product
    @RequestMapping(method = RequestMethod.GET, value = "/existe_2/{lienProduct}/{email}")
    public boolean existe_2(@PathVariable("lienProduct") String lienProduct,@PathVariable("email") String email) {
        return productServ.exist_producByLien(lienProduct,email);
    }

//DELETE
@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
         productServ.delete_product(id);
    }

}
