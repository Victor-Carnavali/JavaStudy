
package switchstatement;
import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How much legs you have: ");
        int legs = scanner.nextInt();
        String type;
        
        switch(legs){
            case 1:
                type = "Saci"; 
                break;
            case 2:
                type = "Bipede";
                break;
            case 3:
                type = "Quadrupedes";
                break;
            case 4:
                type = "Aranha";
                break;
            default:
                type = "ET";
                break;
        }
        System.out.println(type);
    }
    
}
