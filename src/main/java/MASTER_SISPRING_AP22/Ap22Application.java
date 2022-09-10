package MASTER_SISPRING_AP22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController 
public class Ap22Application {

	@GetMapping("/")
	public String index(@RequestParam(value="nom", defaultValue = "Visiteur") String nom){
	    return String.format("Bonjour %s!", nom);
	}

	public static void main(String[] args) {
		SpringApplication.run(Ap22Application.class, args);
	}

}
