package victor.javastudy.screenmovies;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import victor.javastudy.screenmovies.model.DadosEpisodio;
import victor.javastudy.screenmovies.model.DadosSerie;
import victor.javastudy.screenmovies.model.DadosTemporada;
import victor.javastudy.screenmovies.service.ConsumoApi;
import victor.javastudy.screenmovies.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;

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

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
		json = consumoApi.obterDados("https://www.omdbapi.com/?t=the+oc&y=2003&season=1&episode=3&apikey=e119a4bd");
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);
		List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1; i <= dados.totalTemporadas(); i++){
			json = consumoApi.obterDados("https://www.omdbapi.com/?t=the+oc&y=2003&season=" + i + "&apikey=e119a4bd");
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);
	}
}
