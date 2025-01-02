package functiontesttwo;

public class Operations{

    public static String counter(int s, int e) {
        String string = "";
        for (int cc = s; cc <= e; cc++) {
            string += cc + " ";
        }
        return string;
    }
}
