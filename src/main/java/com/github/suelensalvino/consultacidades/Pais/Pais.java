package com.github.suelensalvino.consultacidades.Pais;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    private Long id;

    private String nome;

    @Column(name = "nome_pt")
    private String nomePortugues;

    private String sigla;
    private Integer bacen;

    public Pais() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return nome;
    }

    public String getNomePortugues() {
        return nomePortugues;
    }

    public String getSigla() {
        return sigla;
    }

    public Integer getBacen() {
        return bacen;
    }
}