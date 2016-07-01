package lesson_05;

/**
 * Created by Student on 6/29/2016.
 */
public class Conun {
    public static void main(String[] args) {
        boolean b = 2 > 3 && 10 % 2 == 0 || 3 != 4 ^ 2 == 5;

        System.out.println(b);

        int num1 = 7;
        int num2 = 15;

        /*
        1 & 1 - 1
        1 & 0 - 0
        0 & 1 - 0
        0 & 0 - 0

        0000 0111   = num1 = 7
       &
        0000 1111   = num2 = 15
        ---------
        0000 0111

        */
        System.out.println("7 & 15 = " + (num1 & num2));

        /*
        1 | 1 = 1
        1 | 0 = 1
        0 | 1 = 1
        0 | 0 = 0

        0000 0111   = num1 = 7
       |
        0000 1111   = num2 = 15
        ---------
        0000 1111

        */
        System.out.println("7 | 15 = " + (num1 | num2));

        /*
        1 ^ 1 = 0
        1 ^ 0 = 1
        0 ^ 1 = 1
        0 ^ 0 = 0

        0000 0111   = num1 = 7
       ^
        0000 1111   = num2 = 15
        ---------
        0000 1000

        */
        System.out.println("7 ^ 15 = " + (num1 ^ num2));
    }
}
