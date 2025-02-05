import victor.javastudy.screenmatch.modelos.Filme;

public class Principal{
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefao");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(9);
        meuFilme.avalia(8.5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalAvaliacoes());
        System.out.printf("%.2f estrelas \n", meuFilme.pegaMedia());

    }
}