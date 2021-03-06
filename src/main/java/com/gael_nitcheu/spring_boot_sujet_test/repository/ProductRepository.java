package com.gael_nitcheu.spring_boot_sujet_test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findProductById(Long id);

    List<Product> findByLienProductAndEmail(String lienProduct,String email);

    List<Product> findByEmail(String email);

    boolean existsByLienProductAndEmail(String lienProduct,String email);

}
