package lesson_10;

/**
 * Created by Student on 7/5/2016.
 */
public class IntTest {
    public static void main(String[] args) {
        Integer i1 = 127;
        Integer i2 = 127;
        Integer i3 = 127;
        Integer i4 = 127;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);

        System.out.println(Integer.MAX_VALUE);

        //int[] arr = new int[Integer.MAX_VALUE];

        System.out.println("I'm " + 23 + " years old! " );

        String s = String.format("My name is %s. I'm %d years old!", "Evgeniy", 12);
        System.out.println(s);

        printArr(2, 3, 4, 5, 6, 7, 2);
    }

    static void printArr(int... arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
