package victor.javastudy.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;
    private boolean ehSerie;

    public boolean isEhSerie() {
        return ehSerie;
    }

    public void setEhSerie(boolean ehSerie) {
        this.ehSerie = ehSerie;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do meu filme/serie preferido(a): " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        // Refactor using ternary operator
        System.out.println(ehSerie ? "Duracao da serie: " + getDuracaoEmMinutos() : "Duracao do filme: " + duracaoEmMinutos);
        System.out.println("Total de avaliacoes: " + totalAvaliacoes);
        System.out.printf("%.2f estrelas \n", pegaMedia());
        System.out.println("***********************************************");
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
