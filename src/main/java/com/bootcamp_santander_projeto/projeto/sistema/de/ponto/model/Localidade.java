package com.bootcamp_santander_projeto.projeto.sistema.de.ponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Localidade {
    @Id
    private long id;
    @ManyToOne
    private NivelDeAcesso nivelDeAcesso;
    private String descricao;

}
