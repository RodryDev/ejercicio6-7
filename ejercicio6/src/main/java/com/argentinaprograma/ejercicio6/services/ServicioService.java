package com.argentinaprograma.ejercicio6.services;


import com.argentinaprograma.ejercicio6.model.Servicio;
import com.argentinaprograma.ejercicio6.repositories.ServicioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ServicioService {


    ServicioRepository servicioRepository;

@Autowired
    public ServicioService(ServicioRepository servicioRepository) {
        this.servicioRepository = servicioRepository;
    }


    public Servicio guardar(Servicio s){
     return  this.servicioRepository.save(s);
    }

}
