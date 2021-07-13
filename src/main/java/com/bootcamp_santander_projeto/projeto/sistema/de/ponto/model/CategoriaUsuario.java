package com.bootcamp_santander_projeto.projeto.sistema.de.ponto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class CategoriaUsuario {
    @Id
    private long id;
    public String descricao;
}
