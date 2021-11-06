package com.github.suelensalvino.consultacidades.CidadeRepository;

import com.github.suelensalvino.consultacidades.Cidade.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
