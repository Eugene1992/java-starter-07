package com.hw5;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {

        int array [] = new int[10];
        System.out.println("array:");
        for(int i = 0; i < array.length; i++){
                array[i] = (int) ( Math.random()*100);
            System.out.print(array[i] +" ");
            }
        System.out.println();
        System.out.println();

        //1. Вывести в консоль все парные числа одномерного массива
        System.out.println("Task1:");
        for(int num : array){
            if(num%2 == 0){
                System.out.print(num +" ");
            }
        }
        System.out.println();
        System.out.println();

        //2. Вывести все числа одномерного массива в обратном порядке
        System.out.println("Task2:");
        for(int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] +" ");
        }
        System.out.println();
        System.out.println();

        //3. Вывести первую и вторую половину одномерного массива
        System.out.println("Task3:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] +" ");

            if(i == array.length/2-1){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();

        //4. Вывести первую и вторую половину одномерного массива в обратном порядке
        System.out.println("Task4:");
        for(int i = array.length-1; i >= 0; i--){
            System.out.print(array[i] +" ");

            if(i == array.length/2){
                System.out.println();
            }
        }
        System.out.println();
        System.out.println();

        //5. Найти сумму все элементов в массиве
        System.out.println("Task5:");
        int sum = 0;
        for(int num : array){
            sum = sum + num;
        }
        System.out.println(sum);
        System.out.println();

        //6. Найти среднеарифметическое всех чисел массива
        System.out.println("Task6:");
        int count = 0;
        double result = 0;
        for(int num : array){
            count++;
            result = result + num;
        }
        result = result/count;
        System.out.println(result);
        System.out.println();

        // 7. Найти минимальное и максимальное число в массиве
        System.out.println("Task7:");
        int max = 0;
        int min = 0;
        for(int i = 0; i < array.length; i++){
            if(i == 0){
                max = array[i];
                min = array[i];
            }else{
                if(max < array[i]){
                    max = array[i];
                }
                if(min >  array[i]){
                    min = array[i];
                }
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println();

        //8. Заменить все отрицательные числа в массиве на 0
        System.out.println("Task8:");
        int [] array8 = {2, 5, 7, -4, 25, -3, -1, 5};
        for (int num : array8){
            if(num < 0) num = 0;
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        // 9. Подсчитать одинаковые числа в одномерном массиве
        System.out.println("Task9:");
        int countSame = 0;

        for (int i = 0; i < array8.length; i++){
            for (int j = 0; j < array8.length; j++){
                if(i != j){
                    if(array8[i] == array8[j]){
                        countSame++;
                    }
                }
            }
        }
        System.out.println("The same number = " + countSame/2);
        System.out.println();

        //10. Поменять минимальное и максимальное числа в массиве местами
        System.out.println("Task10:");
        int maxArray8 = 0;
        int minArray8 = 0;
        for(int i = 0; i < array8.length; i++){
            if(i == 0){
                maxArray8 = array8[i];
                minArray8 = array8[i];
            }else{
                if(maxArray8 < array8[i]){
                    maxArray8 = array8[i];
                }
                if(minArray8 >  array8[i]){
                    minArray8 = array8[i];
                }
            }
        }
        //int [] array8 = {2, 5, 7, -4, 25, -3, -1, 5};
        for(int i = 0; i < array8.length; i++){
            if(array8[i] == minArray8){
                array8[i] = maxArray8;
            }else if(array8[i] == maxArray8){
                array8[i] = minArray8;
            }

            System.out.print(array8[i] + " ");
        }
        System.out.println();
        System.out.println();

        //11. Инвертировать массив
        System.out.println("Task11:");
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < arr.length/2; i++){

            int tmp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = tmp;

        }
        System.out.print(Arrays.toString(arr));

    }
}
