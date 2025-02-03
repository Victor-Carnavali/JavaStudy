package primeiroprojeto;
public class PrimeiroProjeto {
    public static void main(String[] args) {
        System.out.println("Este e o screen match");
        
        String nomeDoFilme = "Top Gun Maverick";
        System.out.println("Nome do filme: " + nomeDoFilme);
        int anoDeLancamento = 2022;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        double notaFilme = 7.9;
        boolean incluidoNoPlano = true;
        System.out.println("Nota do filme: " + notaFilme);
        
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.printf("%.2f", media);
        String sinopse;
        sinopse = """
                  Filme: Top Gun Maverick
                  Filme de aventura com Tom Cruise
                  Muito bom!
                  """ + anoDeLancamento;
        System.out.println(sinopse);
        
        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
        
        }
}
