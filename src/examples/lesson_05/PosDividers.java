package lesson_05;

/**
 * Created by Student on 6/29/2016.
 */
public class PosDividers {
    public static void main(String[] args) {
        int num = 12;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
