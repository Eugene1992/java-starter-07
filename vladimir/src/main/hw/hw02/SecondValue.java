package hw02;

import java.util.Scanner;

/**
 * Задание 5
 Задано четыре переменных, найти и вывести на экран вторую по величине.
 */
public class SecondValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b, c, d, minValue;

        System.out.print("Please enter the first digit: ");
        if(scan.hasNextFloat()) {
            a = scan.nextFloat();
        } else {
            System.out.println( "You have entered wrong data" );
            return;
        }

        System.out.print("Please enter the second digit: ");
        if(scan.hasNextFloat()) {
            b = scan.nextFloat();
        } else {
            System.out.println( "You have entered wrong data" );
            return;
        }

        System.out.print("Please enter the third digit: ");
        if(scan.hasNextFloat()) {
            c = scan.nextFloat();
        } else {
            System.out.println( "You have entered wrong data" );
            return;
        }

        System.out.print("Please enter the fourth digit: ");
        if(scan.hasNextFloat()) {
            d = scan.nextFloat();
        } else {
            System.out.println( "You have entered wrong data" );
            return;
        }

        //find min value
        minValue = a < b ? a : b;
        minValue = minValue < c ? minValue : c;
        minValue = minValue < d ? minValue : d;

        //set a as min value
        if( b == minValue){
            b = a;
            a = minValue;
        } else if( c == minValue ){
            c = a;
            a = minValue;
        } else if( d == minValue ) {
            d = a;
            a = minValue;
        }

        //find min value without a
        minValue = b < c ? b : c;
        minValue = minValue < d ? minValue : d;

        System.out.println("The second value is " + minValue);

    }
}
