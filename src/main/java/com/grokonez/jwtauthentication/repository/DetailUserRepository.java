package com.grokonez.jwtauthentication.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grokonez.jwtauthentication.model.User;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface DetailUserRepository extends JpaRepository<User, Long> {
    @Query(
       value = ("SELECT NEW com.grokonez.jwtauthentication.model.User(U.id, U.name) FROM User U WHERE U.email= ?1 ")
    )
    
    User findByEmail(String email);
}
