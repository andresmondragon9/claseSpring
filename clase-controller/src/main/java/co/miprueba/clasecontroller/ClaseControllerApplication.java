package co.miprueba.clasecontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@EnableWebMvc
@SpringBootApplication
public class ClaseControllerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaseControllerApplication.class, args);
	}

}
