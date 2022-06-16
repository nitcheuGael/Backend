package com.gael_nitcheu.spring_boot_sujet_test.repository;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Abonner;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AbonnerRepertorie extends CrudRepository<Abonner, Long> {

    List<Abonner> findByEmail(String email);

    boolean existsByEmail(String email);

}
