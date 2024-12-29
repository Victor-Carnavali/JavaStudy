
package typestest;

public class TypesTest {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Transform Integer to String
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.3f \n", idade);
    }
    
}
