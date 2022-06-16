package com.gael_nitcheu.spring_boot_sujet_test.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Abonnement;
import com.gael_nitcheu.spring_boot_sujet_test.repository.AbonnementRepositori;

@Service
public class AbonnementService {
    @Autowired
    AbonnementRepositori abonn;

    public void sabonnement(Abonnement abonner) {
        abonn.save(abonner);
    }

    public List<Abonnement> liste_des_abonner(String email) {
        return abonn.findByfollo(email);
    }

    public void desabonnement(String email) {
        delet_aboner(find_id_abonner(email));
    }

    private void delet_aboner(long id) {
        abonn.deleteById(id);

    }

    private long find_id_abonner(String follower) {
        return abonn.findByFollower(follower);
    }

}
