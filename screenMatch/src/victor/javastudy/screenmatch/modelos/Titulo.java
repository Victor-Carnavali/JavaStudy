package victor.javastudy.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;
    private boolean ehSerie;

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,3));
    }

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoLancamento;
    }

    public boolean isEhSerie() {
        return ehSerie;
    }

    public void setEhSerie(boolean ehSerie) {
        this.ehSerie = ehSerie;
    }

    public String getNome() {
        return this.nome;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public int getTotalAvaliacoes(){
        return this.totalAvaliacoes;
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
        // Refactoring using ternary operator
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

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                ", anoDeLancamento=" + anoDeLancamento +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                '}';
    }
}
