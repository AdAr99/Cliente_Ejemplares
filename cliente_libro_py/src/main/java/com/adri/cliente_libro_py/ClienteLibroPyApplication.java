package com.adri.cliente_libro_py;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.adri.controller", "com.adri.service"})
public class ClienteLibroPyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteLibroPyApplication.class, args);
	}

	@Bean
	public RestTemplate template(){
		return new RestTemplate();
	}

}
