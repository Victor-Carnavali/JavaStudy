package victor.javastudy.screenmovies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import victor.javastudy.screenmovies.service.ConsumoApi;

@SpringBootApplication
public class ScreenmoviesApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(ScreenmoviesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=the+oc&y=2003&apikey=e119a4bd");
		System.out.println(json);
	}
}
