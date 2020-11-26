package com.example.persona;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API-Persona", version = "0.0.1-SNAPSHOT",description = "APIREST creada en taller de programación avanzada"))
public class Main_PersonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Main_PersonaApplication.class, args);
	}

}
