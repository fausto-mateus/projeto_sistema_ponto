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

public class Empresa {
    @Id
    private long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;


}
