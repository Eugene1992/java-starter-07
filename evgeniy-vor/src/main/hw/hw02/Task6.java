package com.hw02;


public class Task6 {
    public static void main(String[] args) {
        /*Задание 6
        В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
                либо сообщать, что корней нет.*/

        int a = 2;
        int b = 5;
        int c = 3;

        //D = b*b − 4ac:
        int D = b * b - 4 * a * c;


        if (D > 0) {

            //при D > 0 корней два
            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            double x2 = (-b - Math.sqrt(D)) / 2 * a;

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (D == 0) {

            //при D = 0 корень один
            int x = -b / 2 * a;

            System.out.println("x = " + x);

        } else if (D < 0) {

            //при D < 0 вещественных корней нет,Существуют два комплексных корня
            D = -1 * D;

            double x1 = (-b + Math.sqrt(D)) / 2 * a;
            double x2 = (-b - Math.sqrt(D)) / 2 * a;

            System.out.println("No result");
        }
    }
}
