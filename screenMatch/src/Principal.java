public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefao";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 180;
        meuFilme.avaliacao = 9;

        System.out.println("Nome do meu filme preferido: " + meuFilme.nome);
        System.out.println("Ano de lancamento: " + meuFilme.anoDeLancamento);
        System.out.println("Minha avaliacao: " + meuFilme.avaliacao);
    }
}