package hw02;

import java.util.Scanner;

/**
 * Задание 8
 Используя IntelliJ IDEA, создайте класс Interval.
 Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
 промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
 Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
 выводится соответствующее сообщение.
 */
public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a;

        System.out.print("Please enter the digit: ");
        if(scan.hasNextFloat()) {
            a = scan.nextFloat();
        } else {
            System.err.println( "You have entered wrong data" );
            return;
        }

        if( a >= 0 && a <= 14 ){
            System.out.println("Digit " + a + " belongs to [0 - 14]");
        } else if( a >= 15 && a <= 35 ){
            System.out.println("Digit " + a + " belongs to [15 - 35]");
        } else if( a >= 36 && a <= 49 ){
            System.out.println("Digit " + a + " belongs to [36 - 50]");
        } else if( a >= 51 && a <= 100 ){
            System.out.println("Digit " + a + " belongs to [50 - 100]");
        } else if( a == 50 ){
            System.out.println("Digit " + a + " belongs to [36 - 50] and [50 - 100]");
        } else {
            System.err.println("You have entered wrong data");
        }
    }
}
