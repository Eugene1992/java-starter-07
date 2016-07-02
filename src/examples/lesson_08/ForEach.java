package lesson_08;

import java.util.Arrays;

/**
 * Created by Student on 7/2/2016.
 */
public class ForEach {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 12, -12};

        for (int i : arr) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
        }

        Arrays.stream(arr)
                .filter(e -> e < 20)
                .filter(e -> e > 12)
                .toArray();

        System.out.println(Arrays.toString(arr));
    }
}
