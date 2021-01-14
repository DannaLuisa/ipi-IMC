package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Imcs;
import com.grokonez.jwtauthentication.repository.ImcsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping("/api")

public class ImcsController {
    
    @Autowired
    private ImcsRepository imcsRepository;

    @GetMapping("/imcs")
    public List<Imcs> getImcs(
                    @RequestParam(value="idUser") Long idUser
                ) 
    {
        
        return imcsRepository.findByIdUser(idUser);
    }
    
    @PostMapping("/imcs")
    public Imcs createImc(@Valid @RequestBody Imcs imc) {
        return imcsRepository.save(imc);
    }
}
