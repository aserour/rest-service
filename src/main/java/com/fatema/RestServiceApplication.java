package com.fatema;

import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.builder.SpringApplicationBuilder;
// import org.springframework.boot.web.support.SpringBootServletInitializer;
@SpringBootApplication
public class RestServiceApplication {

// 	@Override
// 	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
// 		return application.sources(RestServiceApplication.class);
// 	}
	
	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}
}
