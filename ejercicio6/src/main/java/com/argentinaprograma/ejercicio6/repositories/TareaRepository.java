package com.argentinaprograma.ejercicio6.repositories;


import com.argentinaprograma.ejercicio6.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {

}

