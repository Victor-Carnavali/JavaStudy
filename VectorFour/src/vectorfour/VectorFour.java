package vectorfour;

import java.util.Arrays;

public class VectorFour {

    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        for (int v : vet) {
            System.out.print(v+" ");
        }
        
        System.out.println("");
        int position = Arrays.binarySearch(vet, Integer.SIZE);
        System.out.println(position);
    }

}
