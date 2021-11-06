package com.github.suelensalvino.consultacidades.Cidade;

import com.github.suelensalvino.consultacidades.CidadeRepository.CidadeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("cidades")
public class CidadeResource {

    private final CidadeRepository repository;

    public CidadeResource(final CidadeRepository repository) {
        this.repository = repository;
    }

  @GetMapping
  public List<Cidade> cidades() {
      return repository.findAll();
  }

}