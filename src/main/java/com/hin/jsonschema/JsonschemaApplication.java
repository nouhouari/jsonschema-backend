package com.hin.jsonschema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class JsonschemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonschemaApplication.class, args);
	}

}
