package com.alura.challenguetopico.repository;

import com.alura.challenguetopico.entity.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

}