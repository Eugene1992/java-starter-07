package lesson_05;

/**
 * Created by Student on 6/29/2016.
 */
public class Test {
    public static void main(String[] args) {
        boolean b = true;
        int i = 10;
        b = !b;
        System.out.println(b);
        System.out.println(~i + 1);

        /*
        0000 1010
       ~
        1111 0101
       +
        0000 0001
        ---------
        1111 0101

        */
    }
}
