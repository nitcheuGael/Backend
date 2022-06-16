package com.gael_nitcheu.spring_boot_sujet_test.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Like;
import com.gael_nitcheu.spring_boot_sujet_test.repository.LikeRepositoti;

@Service
public class likeSercice {
    @Autowired
    private LikeRepositoti likeRep;

    public void add_like(Like like) {
        likeRep.save(like);
    }

    /*
     * je concataine les deux parceque je ne peux pas facilemet avoir le
     * id du like d'une person
     * pour avoir id du like je caste id du poste au email du liker
     * avec email du liker et le poste en question je retrouve like
     */
    public void delet_like(String emailSubstring, String idPostStringFromEmail) {
        likeRep.deleteById(likeRep.findByEmailLikerAndIdPoste(emailSubstring, idPostStringFromEmail));
    }

}
