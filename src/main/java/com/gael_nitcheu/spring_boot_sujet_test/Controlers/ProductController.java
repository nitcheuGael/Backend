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

    // LISTE Product D'ID
    @RequestMapping(method = RequestMethod.GET, value = "/list_Product/{lienProduct}")
    public List<Product> list_post(@PathVariable("lienProduct") String lienProduct) {
        return productServ.liste_product(lienProduct);
    }

    // LISTE Product
    @RequestMapping(method = RequestMethod.GET, value = "/list_Product_all")
    public List<Product> list_post_all() {
        return productServ.liste_all_product();
    }

    // LISTE Product
    @RequestMapping(method = RequestMethod.GET, value = "/existe_2/{lienProduct}")
    public boolean existe_2(@PathVariable("lienProduct") String lienProduct) {
        return productServ.exist_producByLien(lienProduct);
    }

    // PRODUIT EXISTE
    @RequestMapping(method = RequestMethod.GET, value = "/lien_exist/{lienProduct}")
    public boolean lienExist(@PathVariable("lienProduct") String lienProduct) {
        return productServ.exist_producByLien(lienProduct);
    }
//DELETE
@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
         productServ.delete_product(id);
    }

}
