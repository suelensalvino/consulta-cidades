package com.github.suelensalvino.consultacidades;

import com.github.suelensalvino.consultacidades.Pais.Pais;
import com.github.suelensalvino.consultacidades.PaisRepository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/paises")
public class RecursosPais {

    @Autowired
    private PaisRepository repository;

    @GetMapping
    public List<Pais> paises(){
        return repository.findAll();
    }
}