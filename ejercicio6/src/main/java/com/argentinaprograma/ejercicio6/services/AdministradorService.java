package com.argentinaprograma.ejercicio6.services;


import com.argentinaprograma.ejercicio6.model.Administrador;
import com.argentinaprograma.ejercicio6.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AdministradorService {

    AdministradorRepository administradorRepository;

    @Autowired

    public AdministradorService(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }


    public int guardar(Administrador a){

        return  this.administradorRepository.save(a).getId();
    }

  public Optional<Administrador> obtenerAdministradorPorId(Integer id){
       return this.administradorRepository.findById(id);
  }
}
