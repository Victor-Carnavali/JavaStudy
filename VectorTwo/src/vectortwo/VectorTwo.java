package vectortwo;

public class VectorTwo {

    public static void main(String[] args) {

        String month[] = {"January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};

        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int c = 0; c < month.length; c++) {
            System.out.println("The month "+ month[c]+" have "+tot[c]+" days.");
        }
    }

}
