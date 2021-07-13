package com.bootcamp_santander_projeto.projeto.sistema.de.ponto.repository;

import com.bootcamp_santander_projeto.projeto.sistema.de.ponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {


}
