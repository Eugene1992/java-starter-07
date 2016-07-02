package lesson_08;

import java.util.Arrays;

public class InnerArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 5, 6, 3, 2};
        int[][] arr = new int[][]{new int[2], arr1};

        //System.out.println(arr1);
        System.out.println(Arrays.deepToString(arr));



    }
}
