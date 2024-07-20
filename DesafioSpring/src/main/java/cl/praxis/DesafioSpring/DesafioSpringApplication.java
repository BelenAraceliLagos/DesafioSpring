package cl.praxis.DesafioSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.praxis.DesafioSpring.controller.Persona;

@SpringBootApplication
public class DesafioSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringApplication.class, args);
		
		Persona persona = new Persona("Belen", "Lagos", 33);
		System.out.println(persona);
	}

}
