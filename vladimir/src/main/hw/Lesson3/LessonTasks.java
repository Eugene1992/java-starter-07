package Lesson3;

/**
 * Created by main_ on 24.06.2016.
 */
public class LessonTasks {
    public static void main(String[] args) {

        /*byte b = 0;
        while (b <= 100) {
            if (b % 3 == 0) {
                System.out.println(b);
            }
            b++;
        }*/

        /*Dec to bin*/
        int digit = 1000;
        int iterator = 128;
        int bit;
        String res = "";
        while (iterator > 0){
            bit = digit / iterator % 2;
            iterator /= 2;
            res += bit + "";
        }

        System.out.print(res);

    }
}
