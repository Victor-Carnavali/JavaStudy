package vectorthree;

import java.util.Arrays;

public class VectorThree {

    public static void main(String[] args) {
        double v[] = {3.5, 2.75, 9, -4, 5};
        Arrays.sort(v);
        for (double  value: v){
            System.out.println("value "+value);
        }
    }

}
