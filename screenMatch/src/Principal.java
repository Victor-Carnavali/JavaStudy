public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefao";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.somaDasAvaliacoes = 9;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(9);
        meuFilme.avalia(8.5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.printf("%.2f estrelas \n", meuFilme.pegaMedia());
    }
}