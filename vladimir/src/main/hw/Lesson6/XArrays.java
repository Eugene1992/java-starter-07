package Lesson6;

import java.util.Arrays;

/**
 * Created by main_ on 02.07.2016.
 */
public class XArrays {
    public static void main(String[] args) {
        showArray();
    }

    public static void arrayFunc(){
        byte[] arrayA = new byte[3];// обявление
        byte arrayB[] = new byte[3];// обявление
        byte[] arrayC = new byte[] {1, 2, 3};// обявление + инициализация
        byte[] arrayD = {1, 2, 3};// обявление + инициализация

    }


    public static void arrayDiagonal(){
        byte arr[][] = new byte[5][5];

        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = (byte)(Math.random() * 10);
            }
        }

        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                System.out.print( arr[i][j] + " " );
            }

            System.out.println();
        }

        System.out.println();
//   \ - diagonal
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                if( i == j ){
                    System.out.print( arr[i][j] + " " );
                } else {
                    System.out.print( "  " );
                }
            }

            System.out.println();
        }

        System.out.println();

//   / - diagonal
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                if( arr.length - i == j + 1 ){
                    System.out.print( arr[i][j] + " " );
                } else {
                    System.out.print( "  " );
                }
            }

            System.out.println();
        }

        System.out.println();

// X - diagonals
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                if( i == j || arr.length - i == j + 1){
                    System.out.print( arr[i][j] + " " );
                } else {
                    System.out.print( "  " );
                }

            }

            System.out.println();
        }

        System.out.println();

// X - diagonals in the box
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                if( i == j || arr.length - i == j + 1 || i == 0 || j == 0 || i == arr.length - 1 || j == arr[i].length - 1){
                    System.out.print( arr[i][j] + " " );
                } else {
                    System.out.print( "  " );
                }

            }

            System.out.println();
        }
    }

    public static void showArray(){

        byte arr[] = new byte[15];

        for(int i = 0; i < arr.length; i ++){
                arr[i] = (byte)(Math.random() * 10);
        }

        System.out.println( toString(arr) );
        System.out.println("MaxValue: " + arrayMaxValue(arr) );
        System.out.println("MinValue: " + arrayMinValue(arr) );
    }

    public static String toString(byte[] arr){
        String res = "";
        res += "[";
        for(int i = 0; i < arr.length; i ++){
            res += i != (arr.length - 1) ? arr[i] + ", " : arr[i] + "" ;
        }

        res += "]";
        return res;
    }

    public static byte arrayMaxValue(byte[] arr){
        byte maxValue = arr[0];
        for(byte i : arr){
            maxValue = i > maxValue ? i : maxValue;
        }

        return maxValue;
    }

    public static byte arrayMinValue(byte[] arr){
        byte minValue = arr[0];
        for(byte i : arr){
            minValue = i < minValue ? i : minValue;
        }

        return minValue;
    }

}