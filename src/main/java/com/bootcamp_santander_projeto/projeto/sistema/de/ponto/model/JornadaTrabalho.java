package com.bootcamp_santander_projeto.projeto.sistema.de.ponto.model;


import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class JornadaTrabalho {
    @Id
    @GeneratedValue
    private long id;
    public String descricao;
}
