package primeiroprojeto;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;
        
        while (nota != 1) {
            System.out.println("Diga sua avaliacao para o filme ou escreva '1' para sair ");
            nota = scanner.nextDouble();
            
            if(nota != 1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }
        
        System.out.printf("Media de avaliacoes %.2f", mediaAvaliacao / 3);
    }
}
