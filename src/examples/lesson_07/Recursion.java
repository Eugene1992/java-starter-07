package lesson_07;

/**
 * Created by Student on 7/1/2016.
 */
public class Recursion {
    public static void main(String[] args) {
        int k = 10;
       //getFib(5);
        //rec(5);
        System.out.println(fac(5));
    }

    static int getFib(int k){
        System.out.print(k + " ");
        return (k < 2) ? k : getFib(k - 1) + getFib(k - 2);
    }

    static void change(int k){
        k = 10;
    }

    static void rec(int k){
        if (k == 0) return;
        System.out.print(k + " ");
        rec(k - 1);
        System.out.print(k + " ");
    }

    static int fac(int k){
        if (k == 1) {
            return 1;
        } else {
            return k * fac(k - 1);
        }
    }
}
