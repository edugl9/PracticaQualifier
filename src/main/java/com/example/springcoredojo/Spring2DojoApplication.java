package com.example.springcoredojo;

import com.example.springcoredojo.qualifier.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring2DojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring2DojoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
		return args -> {
			VehiculoService vs=ctx.getBean(VehiculoService.class);
			System.out.println(vs.getClass().getName() + vs.getVehiculo().contRuedas());
		};
	}
}
