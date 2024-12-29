
package stringcomparation;

public class StringComparation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "Victor";
        String name2 = "Victor";
        String name3 = new String("Victor");
        String result;
        
        result = (name1.equals(name3))? "igual":"diferente";
        System.out.println(result);
    }
    
}
