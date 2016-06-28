package hw02;

import java.util.Scanner;

/**
 * Задание 4
 Задано три переменных, найти и вывести на экран переменную с максимальным значением
 (значения всех переменных разные).
 */
public class MaxValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b, c, res;

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


        res = (a > b) ? a : b;
        res = (res > c) ? res : c;

        System.out.println("MAX value is " + res);

    }
}
