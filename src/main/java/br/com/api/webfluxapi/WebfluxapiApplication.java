package br.com.api.webfluxapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class WebfluxapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxapiApplication.class, args);
	}

}
