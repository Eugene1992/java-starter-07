package lesson_02;

/**
 * Created by Student on 6/23/2016.
 */
public class Ternary {
    public static void main(String[] args) {
        int k = 7;
        int i = k > 5 ? k < 10 ? 2 : 1 : k != 7 ? 0 : 8;

        if (k > 5) {
            if (k < 10) {
                i = 2;
            } else {
                i = 1;
            }
        } else if (k != 7){
            i = 0;
        }

        System.out.println(i);
    }
}
