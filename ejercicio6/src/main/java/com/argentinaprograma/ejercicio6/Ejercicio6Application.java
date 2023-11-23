package com.argentinaprograma.ejercicio6;

import com.argentinaprograma.ejercicio6.model.Administrador;
import com.argentinaprograma.ejercicio6.model.Prestador;
import com.argentinaprograma.ejercicio6.model.Servicio;
import com.argentinaprograma.ejercicio6.model.Tarea;
import com.argentinaprograma.ejercicio6.services.AdministradorService;
import com.argentinaprograma.ejercicio6.services.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Ejercicio6Application {

	private static ServicioService servicioService;
	private static AdministradorService administradorService;


	@Autowired
	public Ejercicio6Application(ServicioService servicioService, AdministradorService administradorService) {
		this.servicioService = servicioService;
		this.administradorService = administradorService;
	}


	public static void main(String[] args) {
		SpringApplication.run(Ejercicio6Application.class, args);



		inicializarEntidades();

//Toma el id de administrador en la bd y me lo reasigna en
// a1 para que sea igual




		}



private static void inicializarEntidades(){

	Administrador a1 = new Administrador
			(0, "Juan", "Perez",
					"perezJuan@email.com", "Password");

	a1.setId(administradorService.guardar(a1));




	//Servicio s1 = new Servicio
	//(0, "programacion", "Backend",
	//a1, p1, List.of(t1));


	//s1.setId(servicioService.guardar(s1));




	// Prestador p1 = new Prestador
	//(0,"Mario","Martinez","MMartinez@email.com",
	//	"Disponible","Centro", "dni",
	//	232323, 347348,"Tarde");

	//Tarea t1 = new Tarea
	//	(0, "Api", 200.5);

}
	}
