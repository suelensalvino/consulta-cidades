package com.github.suelensalvino.consultacidades.Estado;

import com.github.suelensalvino.consultacidades.EstadoRepository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoResource {

    private final EstadoRepository repository;

    public EstadoResource(final EstadoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Estado> estados() {
        return repository.findAll();
    }
}