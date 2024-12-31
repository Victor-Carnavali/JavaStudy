
package ifelseifstatement;
import java.time.Year;
import java.util.Scanner;

public class IfElseIfStatement {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int systemYear = Year.now().getValue();
        System.out.print("Year of birth: ");
        int age = systemYear - scanner.nextInt();
        System.out.println(age);
        
            if(age < 16){
                System.out.println("Dont vote");
            } else {
                if((age >= 16 && age < 18) || (age > 70)) {
                    System.out.println("Optional");
            } else {
                System.out.println("Required vote");
            }
        }
    } 
}
