package Lesson6.Hw06;

import java.util.Arrays;

/**
 * Created by main_ on 03.07.2016.
 */

public class ArrayOps {

    private boolean checkArray(int arr[]){
        return !(arr == null || arr.length == 0);

    }

    //1. Вывести в консоль все парные числа одномерного массива
    public String printEvenElements(int arr[]){
        if( !checkArray(arr) ){
            return "null";
        }

        String res = "";

        for(int i = 0; i < arr.length; i ++){
            res += arr[i] % 2 == 0 ? arr[i] + " " : "";
        }

        return res;
    }

    //2. Вывести все числа одномерного массива в обратном порядке
    public String printReversedArr(int arr[]){
        if( !checkArray(arr) ){
            return "null";
        }

        String res = "";

        for(int i = arr.length - 1; i >= 0; i --){
            res += arr[i] + " ";
        }

        return res;
    }

    //3. Вывести первую и вторую половину одномерного массива
    public String printHalves(int arr[]){
        if( !checkArray(arr) ){
            return "null";
        }

        String res = "";

        for(int i = 0; i < arr.length; i ++){
            res += arr[i] + " ";
            if( i == arr.length / 2 - 1){
                res += "\n";
            }
        }

        return res;
    }

    //4. Вывести первую и вторую половину одномерного массива в обратном порядке
    public String printReversedHalves(int arr[]){
        if( !checkArray(arr) ){
            return "null";
        }

        String res = "";
        for(int i = arr.length/2 - 1; i >= 0; i-- ){
            res += arr[i] + " ";
        }

        res += "\n";
        for(int i = arr.length - 1; i >= arr.length / 2  ; i-- ){
            res += arr[i] + " ";
        }

        return res;
    }

    //5. Найти сумму все элементов в массиве
    public int getElementsSum(int arr[]) throws EmptyArrayException{
        if( !checkArray(arr) ){
            throw new EmptyArrayException();
        }

        int res = 0;
        for(int element: arr){
            res += element;
        }

        return res;
    }

    //6. Найти среднеарифметическое всех чисел массива
    public int getAvgOfArr(int arr[]) throws EmptyArrayException {
        if( !checkArray(arr) ){
            throw new EmptyArrayException();
        }

        int res = 0;
        for(int element: arr){
            res += element;
        }

        return res = res/arr.length;
    }

    //7. Найти минимальное число в массиве
    public int getArrayMinValue(int[] arr) throws EmptyArrayException {
        if( !checkArray(arr) ){
            throw new EmptyArrayException();
        }

        int minValue = arr[0];
        for(int i : arr){
            minValue = i < minValue ? i : minValue;
        }

        return minValue;
    }

    //7. Найти максимальное число в массиве
    public int getArrayMaxValue(int[] arr) throws EmptyArrayException {
        if( !checkArray(arr) ){
            throw new EmptyArrayException();
        }

        int maxValue = arr[0];
        for(int i : arr){
            maxValue = i > maxValue ? i : maxValue;
        }

        return maxValue;
    }

    //8. Заменить все отрицательные числа в массиве на 0
    public int[] convertToPositiveArr(int[] arr) throws EmptyArrayException {
        if( !checkArray(arr) ){
            throw new EmptyArrayException();
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] < 0 ? 0 : arr[i];
        }

        return arr;
    }

    //9. Подсчитать одинаковые числа в одномерном массиве
    public String printRepeatedElements(int[] arr) {
        if( !checkArray(arr) ){
            return "null";
        }

        String res = "";
        int x, j, counter = 0;
        //inserted sorting
        for(int i = 0; i < arr.length; i++){
            x = arr[i];

            for(j = i - 1; j >= 0 && arr[j] > x ; j-- ){
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = x;
        }

        for(int i = 0; i < arr.length; i++){
            counter++;
            if( i + 1 != arr.length && arr[i] != arr[i+1] ){
                res += arr[i] + ":" + counter + "\n";
                counter = 0;
            }
        }

        return res;
    }

    //10. Поменять минимальное и максимальное числа в массиве местами
    public int[] replaceMinMax(int arr[]) throws EmptyArrayException {
        if( !checkArray(arr) ){
            throw new EmptyArrayException();
        }

        int minVal, maxVal;
        minVal = getArrayMinValue(arr);
        maxVal = getArrayMaxValue(arr);
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == minVal) {
                arr[i] = maxVal;
            } else if(arr[i] == maxVal){
                arr[i] = minVal;
            }
        }

        return arr;
    }

    //11. Инвертировать массив
    public int[] getInvertedArr(int arr[]) throws EmptyArrayException {
        if( !checkArray(arr) ){
            throw new EmptyArrayException();
        }

        for(int i = 0; i < arr.length / 2; i++){
            arr[i] = arr[arr.length - 1 - i] + arr[i];
            arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];
            arr[i] = arr[i] - arr[arr.length - 1 - i];
        }

        return arr;
    }

}
