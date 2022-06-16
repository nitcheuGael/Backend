package com.gael_nitcheu.spring_boot_sujet_test.Service;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Abonner;
import com.gael_nitcheu.spring_boot_sujet_test.repository.AbonnerRepertorie;

import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AbonnerServive {

    @Autowired
    private AbonnerRepertorie abonnerRep;

    public void add_abonner(Abonner abonner) {
        abonnerRep.save(abonner);
    }

    public boolean get_donner(String email) {
        boolean test = true;
        if (abonnerRep.findByEmail(email).size() == 0) {
            test = false;
        }
        return test;
    }

    public void update_abonner(Abonner abonnerUp, String email) {
        abonnerRep.save(abonnerUp);
    }

    public List<Abonner> get_abonner(String email) {
        return abonnerRep.findByEmail(email);
    }

    public boolean existe_abonner(String email) {
        return abonnerRep.existsByEmail(email);
    }
}
