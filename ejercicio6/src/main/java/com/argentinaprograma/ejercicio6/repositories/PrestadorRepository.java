package com.argentinaprograma.ejercicio6.repositories;

import com.argentinaprograma.ejercicio6.model.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestadorRepository extends JpaRepository<Prestador, Integer> {
}
