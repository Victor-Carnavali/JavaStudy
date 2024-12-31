package exerciserepeat;

import javax.swing.JOptionPane;

public class ExerciseRepeat {

    public static void main(String[] args) {
        // TODO code application logic here
        int number, sum = 0;
        int items = 0, average = 0;
        int oneHundred = 0;

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "Report a number, put 0 to break: "));
            
            sum += number;
            items++;
            
            if (number != 0) {
                average = sum / items;
                System.out.println(items);
            } else {
                items--;
                break;
            }
            
            if (number >= 100) {
                oneHundred++;
            }
           
            
        } while (number != 0);
        JOptionPane.showMessageDialog(null, "Final result " + sum + ", average is: " + average + ", number of items: " + items + " one hundred: " + oneHundred);
    }

}
