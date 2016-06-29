package hw02;

import java.util.Scanner;

/**
 * Задание 6
 В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
 будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
 либо сообщать, что корней нет.
 */
//TODO: strange things when a == 0
public class SquareEquation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b, c, discr, x1, x2;

        System.out.print("Please enter the (a): ");
        if(scan.hasNextFloat()) {
            a = scan.nextFloat();
        } else {
            System.out.println( "You have entered wrong data" );
            return;
        }

        System.out.print("Please enter the (b): ");
        if(scan.hasNextFloat()) {
            b = scan.nextFloat();
        } else {
            System.out.println( "You have entered wrong data" );
            return;
        }

        System.out.print("Please enter the (c): ");
        if(scan.hasNextFloat()) {
            c = scan.nextFloat();
        } else {
            System.out.println( "You have entered wrong data" );
            return;
        }

        if( a == 0 ) {
            System.out.println("There are no roots");
            return;
        }

        if( a % 2 == 0 ){
            discr = (b / 2) * (b / 2) - a * c;
            if(discr < 0){
                System.out.println("There are no roots");
                return;
            }

            x1 = (-b / 2 + (float)Math.sqrt(discr) ) / a;
            x2 = (-b / 2 - (float)Math.sqrt(discr) ) / a;
        } else {
            discr = b * b - 4 * a * c;
            if(discr < 0){
                System.out.println("There are no roots");
                return;
            }

            x1 = (-b + (float)Math.sqrt(discr) ) / (2 * a);
            x2 = (-b - (float)Math.sqrt(discr) ) / (2 * a);
        }

        System.out.println("X1: " + x1);
        System.out.println("X2: " + x2);

    }
}
