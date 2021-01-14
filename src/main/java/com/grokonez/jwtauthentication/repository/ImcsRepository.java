package com.grokonez.jwtauthentication.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grokonez.jwtauthentication.model.Imcs;
import java.util.List;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface ImcsRepository extends JpaRepository<Imcs, Long> {
    @Query(
       value = ("SELECT NEW com.grokonez.jwtauthentication.model.Imcs(I.id, I.idUser, I.resultado, I.fecha) FROM Imcs I WHERE I.idUser = ?1 ")
    )
    
    List<Imcs> findByIdUser(Long id);
    
}
