package lesson_07;

/**
 * Created by Student on 7/1/2016.
 */
public class Test {
    public static void main(String[] args) {
        printSum(2, 4, 2);
    }

    static void printSum(double num1, double num2){
        System.out.println(num1 + num2);
    }

    static void printSum(int num1, int num2){
        System.out.println(num1 + num2);
    }

    static void printSum(int num1, int num2, int num3){
        System.out.println(num1 + num2 + num3);
    }

    static void printSum(double num1, int num2){

    }

    static void printSum(int num2, double num1){
        System.out.println(num1 + num2);
    }
}
