import victor.javastudy.screenmatch.modelos.Filme;
import victor.javastudy.screenmatch.modelos.Serie;

public class Principal{
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.avalia(10);
        meuFilme.avalia(8.95);
        meuFilme.avalia(9.3);
        meuFilme.exibeFichaTecnica();

        Serie lost = new Serie();
        lost.setEhSerie(true);
        lost.avalia(6.5);
        lost.avalia(7);
        lost.avalia(6.95);
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);

        lost.exibeFichaTecnica();
    }
}