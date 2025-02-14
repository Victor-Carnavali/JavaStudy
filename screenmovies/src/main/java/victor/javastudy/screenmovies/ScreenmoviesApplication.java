package victor.javastudy.screenmovies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import victor.javastudy.screenmovies.principal.Principal;

@SpringBootApplication
public class ScreenmoviesApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ScreenmoviesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
