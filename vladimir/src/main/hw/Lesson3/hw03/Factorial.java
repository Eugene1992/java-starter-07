package Lesson3.hw03;

import java.util.Scanner;

/**
 * 8. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
 9. Выведите на экран все положительные делители натурального числа, введенного пользователем. TODO: question about this
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit, factorial = 1;

        System.out.print("Please enter the digit: ");
        if( scan.hasNextInt() ){
            digit = scan.nextInt();
        } else {
            System.err.println("You have entered wrong data");
            return;
        }

        for(int i = 1; i <= digit; i++ ){
            factorial *= i;
        }

        System.out.print("Factorial is " + factorial);

    }
}
