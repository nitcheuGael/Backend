package com.gael_nitcheu.spring_boot_sujet_test.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.gael_nitcheu.spring_boot_sujet_test.Model.Product;
import com.gael_nitcheu.spring_boot_sujet_test.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void creer_product(Product product) {
        productRepository.save(product);
    }

    public void update_product(Product product, long id) {
        productRepository.save(product);
    }

    public List<Product> liste_product(String lienProduct,String email) {
        return productRepository.findByLienProductAndEmail(lienProduct,email);

    }

    public List<Product> liste_product_byEmail(String email) {
        return productRepository.findByEmail(email);

    }

    public List<Product> liste_all_product() {
        return (List<Product>) productRepository.findAll();
    }

    public List<Product> list_producByLien(String lienProduct,String email) {
        return productRepository.findByLienProductAndEmail(lienProduct,email);
    }

    public boolean exist_producByLien(String lienProduct,String email) {
        return productRepository.existsByLienProductAndEmail(lienProduct,email);
    }
    public void delete_product(long id) {
        productRepository.deleteById(id);
    }

}
