package Lesson6.Hw06;

import java.util.Arrays;

/**
 * Created by main_ on 03.07.2016.
 */
public class ArrPolygon {
    public static void main(String[] args) {
        int arr[] = new int[11];

        for(int i = 0; i < arr.length; i ++){
            arr[i] = (int)(Math.random() * 20 - 10);
        }

        ArrayOps arrOps = new ArrayOps();

        System.out.println("----------Show Array----------");
        System.out.println( Arrays.toString(arr) );
        System.out.println();

/*
        System.out.println("----------Even elements----------");
        System.out.println( arrOps.printEvenElements(arr) );
        System.out.println();

        System.out.println("----------Reversed array----------");
        System.out.println( arrOps.printReversedArr(arr) );
        System.out.println();

        System.out.println("----------First and the second halves of the array----------");
        System.out.println( arrOps.printHalves(arr) );
        System.out.println();

        System.out.println("----------Reversed first and the second halves of the array----------");
        System.out.println( arrOps.printReversedHalves(arr) );
        System.out.println();


        System.out.println("----------Sum of the elements of the array----------");
        try {
            System.out.println(arrOps.getElementsSum(arr));
        } catch(EmptyArrayException ex) {
            System.out.println("Array is empty");
        }
        System.out.println();


        System.out.println("----------Average of the elements of the array----------");
        try {
            System.out.println(arrOps.getAvgOfArr(arr));
        } catch (EmptyArrayException ex){
            System.out.println("Array is empty");
        }
        System.out.println();


        System.out.println("----------Min value of the array----------");
        try {
            System.out.println(arrOps.getArrayMinValue(arr));
        } catch (EmptyArrayException ex){
            System.out.println("Array is empty");
        }
        System.out.println();


        System.out.println("----------Max of the array----------");
        try {
            System.out.println(arrOps.getArrayMaxValue(arr));
        } catch (EmptyArrayException ex){
            System.out.println("Array is empty");
        }
        System.out.println();


        System.out.println("----------Replace negative digits with 0 ----------");
        try {
            System.out.println( Arrays.toString( arrOps.convertToPositiveArr(arr) ) );
        } catch (EmptyArrayException ex){
            System.out.println("Array is empty");
        }
        System.out.println();


        System.out.println("----------Repeated elements----------");
        System.out.println(arrOps.printRepeatedElements(arr));
        System.out.println();


        System.out.println("----------Replace MAX with MIN and vice versa ----------");
        try {
            System.out.println( Arrays.toString( arrOps.replaceMinMax(arr) ) );
        } catch (EmptyArrayException ex){
            System.out.println("Array is empty");
        }
        System.out.println();
*/

        System.out.println("----------Inverted array----------");
        try {
            System.out.println( Arrays.toString( arrOps.getInvertedArr(arr) ) );
        } catch (EmptyArrayException ex){
            System.out.println("Array is empty");
        }
        System.out.println();
    }
}
