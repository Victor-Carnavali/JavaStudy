public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do meu filme preferido: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}

