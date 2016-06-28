package hw02;

import java.util.Scanner;

/**
 * Created by Rain on 23.06.2016.
 */
public class Solution {
    public static void main(String[] args) {
//        Задание 2
//        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
//        консоли целое число, чётным либо нечётным.

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scan.nextInt();
        if ((num % 2) == 0) {
            System.out.print("Вы ввели четное число!");
        } else {
            System.out.print("Вы ввели не четное число!");
        }


//        Задание 3
//        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
//        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
        double a;
        double b;
        int c = 10;
        System.out.print("Введите первое число: ");
        Scanner scan1 = new Scanner(System.in);
        a = scan.nextInt();

        System.out.print("Введите второе число: ");
        scan1 = new Scanner(System.in);
        b = scan1.nextInt();

        if (b > c) {
            System.out.println("Число " + b + " ближе к " + c);
        }
        if (a > c) {
            System.out.println("Число " + a + " ближе к " + c);
        }
        if (a == b) {
            System.out.println("Числа " + a + " и " + b + " равноудалены от " + c);
        }


//        Задание 4
//        Задано три переменных, найти и вывести на экран переменную с максимальным значением
//        (значения всех переменных разные).

        int varOne;
        int varTwo;
        int varThree;

        System.out.print("Введите первое число: ");
        Scanner sc = new Scanner(System.in);
        varOne = sc.nextInt();
        System.out.print("Введите второе число: ");
        sc = new Scanner(System.in);
        varTwo = sc.nextInt();
        System.out.print("Введите третье число: ");
        sc = new Scanner(System.in);
        varThree = sc.nextInt();

        if (varOne > varTwo && varOne > varThree) {
            System.out.println(varOne + " имеет максимальное значение!");
        }
        if (varTwo > varOne && varTwo > varThree) {
            System.out.println(varTwo + " имеет максимальное значение!");
        }
        if (varThree > varOne && varThree > varTwo) {
            System.out.println(varThree + " имеет максимальное значение!");
        }

//        Задание 5
//        Задано четыре переменных, найти и вывести на экран вторую по величине.
        int a;
        int b;
        int c;
        int d;
        System.out.println("Введите 4 разных числа.");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        if (a > b && a > c && a > d && b > c && b > d) {
            System.out.println("Второе по величине число " + b);
        } else if (a > b && a > c && a > d && c > b && c > d) {
            System.out.println("Второе по величине число " + c);
        } else if (a > b && a > c && a > d && d > c && d > b) {
            System.out.println("Второе по величине число " + d);
        } else if (b > a && b > c && b > d && a > c && a > d) {
            System.out.println("Второе по величине число " + a);
        } else if (b > a && b > c && b > d && c > a && c > d) {
            System.out.println("Второе по величине число " + c);
        } else if (b > a && b > c && b > d && d > c && d > a) {
            System.out.println("Второе по величине число " + d);
        } else if (c > a && c > b && c > d && a > b && a > d) {
            System.out.println("Второе по величине число " + a);
        } else if (c > a && c > b && c > d && b > a && b > d) {
            System.out.println("Второе по величине число " + b);
        } else if (c > a && c > b && c > d && d > a && d > b) {
            System.out.println("Второе по величине число " + d);
        } else if (d > a && d > b && d > c && a > b && a > c) {
            System.out.println("Второе по величине число " + a);
        } else if (d > a && d > b && d > c && b > a && b > c) {
            System.out.println("Второе по величине число " + c);
        } else if (d > a && d > b && d > c && c > a && c > b) {
            System.out.println("Второе по величине число " + c);
        } else {
            System.out.println("Неверный ввод. ");

        }

//        Задание 6
//        В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
//        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
//        либо сообщать, что корней нет.

        String s = "ax²+bx+c=0";
        double a = 12.13;
        double b = 33.31;
        double c = 12.2;
        double n = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b - Math.sqrt(n)) / 2 * a;
        double x2 = (-b + Math.sqrt(n)) / 2 * a;
        System.out.println("У квадратного уровнения " + s + " два корня, первый х1 = " + x1 + " и х2 = " + x2 + ".");

    }
}



