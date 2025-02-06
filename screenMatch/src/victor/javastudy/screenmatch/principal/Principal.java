package victor.javastudy.screenmatch.principal;

import victor.javastudy.screenmatch.calculos.CalculadoraDeTempo;
import victor.javastudy.screenmatch.calculos.FiltroRecomendacao;
import victor.javastudy.screenmatch.modelos.Episodio;
import victor.javastudy.screenmatch.modelos.Filme;
import victor.javastudy.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal{
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefao", 1972, 180);
        meuFilme.avalia(10);
        meuFilme.avalia(8.95);
        meuFilme.avalia(9.3);
        meuFilme.exibeFichaTecnica();

        Serie lost = new Serie("Lost", 2000, 10);
        lost.setEhSerie(true);
        lost.avalia(6.5);
        lost.avalia(7);
        lost.avalia(6.95);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();

        Filme outroFilme = new Filme("Avatar", 2023, 200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Testando calculadora: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville", 2003, 200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.getFirst().getNome());
        System.out.println(listaDeFilmes);
    }
}