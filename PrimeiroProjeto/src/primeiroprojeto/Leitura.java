import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Digite seu filme favorito: ");
            String filme = scanner.nextLine();
            
            System.out.print("Digite o ano de lancamento do filme: ");
            int anoDoFilme = scanner.nextInt();
            
            System.out.print("Diga sua avaliacao para o filme: ");
            double avaliacao = scanner.nextDouble();
            
            System.out.println(filme);
            System.out.println(anoDoFilme);
            System.out.printf("%.2f", avaliacao);
    }
}
