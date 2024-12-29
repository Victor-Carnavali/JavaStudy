
package primitivetypes;
import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class PrimitiveTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("O nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("A nota do aluno: ");
        float nota = scanner.nextFloat();

        System.out.format("A nota de %s e %.2f \n",nome,nota);
    }
    
}
