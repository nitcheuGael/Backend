package com.gael_nitcheu.spring_boot_sujet_test.repository;

import org.springframework.data.repository.CrudRepository;

import com.gael_nitcheu.spring_boot_sujet_test.Model.Like;

public interface LikeRepositoti extends CrudRepository<Like, Long> {

    /*
     * IL SERA TRES COMPLIQUER POUR MOI D'AVOIR L'ID
     * DU POSTS ETANT DONNER QUE C'EST UNIQUEMENT SOIT ID
     * DU POSTS SOIT ID DU LIKE QUE JE PEUX ALOIR UN LIK PRESSI
     * DONC ID DU LIKEUR COMME C'EST LE EMAIL, JE VAIS CONCATENER AVEC ID DU POSTS
     */
    long findByEmailLikerAndIdPoste(String email, String idPost);

    long findByIdPoste(long idPoste);

}
