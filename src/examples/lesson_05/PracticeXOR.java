package lesson_05;


public class PracticeXOR {
    public static void main(String[] args) {
        int x = 5, y = 7;

        System.out.println("x = " + x + " y = " + y);

        /*

        1 ^ 1 = 0
        1 ^ 0 = 1
        0 ^ 1 = 1
        0 ^ 0 = 0

        */

        x = x^y; // x == 2
        //     0101
        //     0111
        //     ----
        // x = 0010
        y = x^y; // y == 5
        //     0010
        //     0111
        //     ----
        // y = 0101
        x = x^y; // x == 7
        //     0010
        //     0101
        //     ----
        // y = 0111

        System.out.println("x = " + x + " y = " + y);
    }
}
