import victor.javastudy.screenmatch.modelos.Filme;
import victor.javastudy.screenmatch.modelos.Serie;

public class Principal{
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duracao do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalAvaliacoes());
        System.out.printf("%.2f estrelas \n", meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        System.out.println("Duracao do filme: " + lost.getDuracaoEmMinutos());

    }
}