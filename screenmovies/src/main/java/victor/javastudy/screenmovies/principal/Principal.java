package victor.javastudy.screenmovies.principal;

import victor.javastudy.screenmovies.model.DadosSerie;
import victor.javastudy.screenmovies.model.DadosTemporada;
import victor.javastudy.screenmovies.service.ConsumoApi;
import victor.javastudy.screenmovies.service.ConverteDados;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=e119a4bd";
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu(){
        System.out.print("Digite o nome da serie para busca: ");
        var nomeSerie = leitura.nextLine();
        System.out.print("Digite o ano da serie: ");
        int anoSerie = leitura.nextInt();
        consumo = new ConsumoApi();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+")+ "&y=" + anoSerie + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1; i <= dados.totalTemporadas(); i++){
			json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+")+ "&y=" + anoSerie + "&season=" + i + API_KEY);
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}
        temporadas.forEach(System.out::println);

    }
}
