package lesson_05;

/**
 * Created by Student on 6/29/2016.
 */
public class BitsShift {
    public static void main(String[] args) {
        //    0000 0000 1111 1101
        //  <<
        //    0000 0011 1111 0100
        System.out.println(253 << 4); // *

        //    0000 0000 1111 1101
        //  >>
        //    0000 0000 0011 1111
        System.out.println(253 >> 8); // /


    }
}
