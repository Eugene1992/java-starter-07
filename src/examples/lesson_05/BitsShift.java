package lesson_05;

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
