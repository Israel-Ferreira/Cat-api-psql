package br.com.codekaffee.catapisb.catapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"br.com.codekaffee.catapisb.catapi.models"})
@EnableJpaRepositories(basePackages = {"br.com.codekaffee.catapisb.catapi.repositories"} )
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
