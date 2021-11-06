package com.github.suelensalvino.consultacidades.Cidade;

import org.hibernate.annotations.Type;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.*;
import javax.persistence.*;

@Entity
@Table(name = "cidade")

public class Cidade {

    @Id
    private Long id;

    private String nome;
    private Integer uf;
    private Integer ibge;

    @Column(name = "lat_lon")
    private String geolocalizacao;

    public Cidade() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Integer getUf() {
        return uf;
    }

    public Integer getIbge() {
        return ibge;
    }

    public String getGeolocalizacao() {
        return geolocalizacao;
    }

}