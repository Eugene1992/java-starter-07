package hw02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Задание 2
 Создать программу, проверяющую и сообщающую на экран, является ли введенное с
 консоли целое число, чётным либо нечётным.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        String val;

        System.out.print("Please enter the digit: ");
        if(scan.hasNextInt()) {
            i = scan.nextInt();
        } else {
            System.out.println( "You have entered wrong data" );
            return;
        }

        val = (i % 2 == 0) ? "even" : "odd";
        System.out.println("Digit " + i + " is " + val);
    }
}
