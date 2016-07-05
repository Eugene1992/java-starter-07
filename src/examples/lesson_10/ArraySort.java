package lesson_10;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = feelArray(10000);
        System.out.println(bublleSort(arr));
        System.out.println(arraysSort(arr));
    }

    static long bublleSort(int[] arr){
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        return end - start;
    }

    static long arraysSort(int[] arr){
        long start = System.currentTimeMillis();
        Arrays.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        return end - start;
    }

    static int[] feelArray(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        return arr;
    }
}
