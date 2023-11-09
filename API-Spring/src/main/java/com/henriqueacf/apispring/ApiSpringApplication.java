package com.henriqueacf.apispring;

import com.henriqueacf.apispring.model.Course;
import com.henriqueacf.apispring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpringApplication.class, args);
	}

	//POPULANDO DADOS PARA INICIALIZAR
	//APENAS ENQUANTO NAO ESTA CONECTADO NO BANCO DE DADOS
	@Bean
	CommandLineRunner initDataBase(CourseRepository courseRepository){
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular With Spring");
			c.setCategory("FullStack");

			courseRepository.save(c);
		};
	}

}
