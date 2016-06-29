package hw02;

import java.util.Scanner;

/**
 * Задание 3
 Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
 Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
 */
public class CloserDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b;
        float distanceA, distanceB;

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

        distanceA = a < 10 ? 10 - a : a - 10;
        distanceB = b < 10 ? 10 - b : b - 10;

        if( distanceA > distanceB ){
            System.out.println("second digit closer than first");
        } else if( distanceB > distanceA){
            System.out.println("first digit closer than second");
        } else {
            System.out.println("first digit and the second one have similar distance");
        }

    }
}
