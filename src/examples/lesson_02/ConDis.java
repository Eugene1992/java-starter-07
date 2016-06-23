package lesson_02;

/**
 * Created by Student on 6/23/2016.
 */
public class ConDis {
    public static void main(String[] args) {
        int k = 17;

        /*if (k < 10){
            if (k > 5){
                System.out.println(k);
            }
        }*/

        /*if (k < 10 && k > 5 && k != 7){
            System.out.println(k);
        }*/

        // true  x true  = true
        // false x true  = false
        // true  x false = false
        // false x false = false

        /*if (k < 10 || k > 5 || k != 17){
            System.out.println(k);
        }*/

        /*if (k < 10 && k > 5 || k == 17){
            System.out.println(k);
        }*/

        /*boolean b = false;

        if (!b){
            System.out.println(b);
        }*/

        int s = 17;

        /*if (s < 6 && s / 0 == 5){
            System.out.println(s);
        }*/


        if (s > 5 || s < 10 | s / 0 == 3 && s == 9){
            System.out.println(s);
        }

        // true  x true  = true
        // false x true  = true
        // true  x false = true
        // false x false = false

    }
}
