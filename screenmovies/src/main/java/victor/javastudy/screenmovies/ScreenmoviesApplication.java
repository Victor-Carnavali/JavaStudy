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
//		List<DadosTemporada> temporadas = new ArrayList<>();
//
//		for (int i = 1; i <= dados.totalTemporadas(); i++){
//			json = consumoApi.obterDados("https://www.omdbapi.com/?t=the+oc&y=2003&season=" + i + "&apikey=e119a4bd");
//			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
//			temporadas.add(dadosTemporada);
//		}
//		temporadas.forEach(System.out::println);
	}
}
