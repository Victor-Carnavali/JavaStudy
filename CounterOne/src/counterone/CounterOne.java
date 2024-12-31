package counterone;

public class CounterOne {

    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;

        /*
        while (cc < 10) {
            cc++;
            if(cc == 5 || cc == 7){
                break;
            }
            System.out.println("Somersault = " + cc);
        }
        */
        
        do{
            System.out.println("Somersault = " + cc);
            cc++;
        }
        while(cc<4);
    }

}
