package hw01;

public class Solution {
    public static void main(String[] args) {
        //Task1.
        System.out.println("1. Создать четыре целочисленные переменные типов byte, short, int, long.");

        byte a1 = 127;
        short b1 = 32767;
        int c1 = 2147483647;
        long d1 = 922372036854775807l;

        System.out.println("byte a1= " +a1 + " short b1 =" + b1 + " short c1 = " + c1 + " short d1 = " + d1);
        System.out.println();

        //Task2.
        System.out.println("2. Инициализировать переменную типа byte результатом суммы двух любых чисел");

        byte a2 = 125 + 2;
        System.out.println("byte a2 = 125 + 2  result: a2 = " + a2);
        System.out.println();

        //Task3
        System.out.println("3. Инициализировать переменную типа short  результатом вычитания двух любых чисел");

        short a3 = 32768 - 1;
        System.out.println("short a3 = 32768 - 1  result: a2 = " + a3);
        System.out.println();

        //Task4
        System.out.println("4. Инициализировать переменную типа int результатом деления двух любых чисел");

        int a4 = 40/2;
        System.out.println("int a4 = 40/2;  result: a4 = " + a4);
        System.out.println();

        //Task5
        System.out.println("5. Инициализировать переменную типа long результатом умножения двух любых чисел");

        long a5 = 3000 * 2;
        System.out.println("long a5 = 3000 * 2;  result: a5 = " + a5);
        System.out.println();

        //Task6
        System.out.println("6. Передать перменной типа byte результат суммы двух переменной типа byte");

        byte a6 = 25;
        byte b6 = 5;
        byte c6 =(byte) (a6 + b6);
        System.out.println("byte a6 = 25; byte b6 = 5; byte c6 =(byte) (a6 + b6);  result: c6 = " + c6);
        System.out.println();

        //Task7
        System.out.println("7. Передать переменной типа byte результат суммы двух переменных типа " +
                "short, деленных на третью переменную типа byte");

        short a7 = 20;
        short b7 = 10;
        byte c7 = 2;
        byte d7 =(byte) (a7/c7+b7/c7);

        System.out.println("byte d7 =(byte) (a7/c7+b7/c7);  result: d7 = " + d7);
        System.out.println();

        //Task8
        System.out.println("8. Переменной типа int передать результат деления двух short," +
                " умноженных на результат деления двух byte");

        short a8 = 20;
        short b8 = 10;
        byte c8 = 25;
        byte d8 = 5;

        int e8 = (a8/b8) * (c8/d8);
        System.out.println("int e8 = (a8/b8) * (c8/d8);  result: e8 = " + e8);
        System.out.println();

        //Task9
        System.out.println("9. Поменять значения двух целочисленных переменных используя третью");

        int a9 = 10;
        int b9 = 20;
        System.out.println("Before: " +"a9=" + a9 + " b9=" + b9);
        int c9 = a9;

        a9 = b9;
        b9 = c9;

        System.out.println("After:  " +"a9=" + a9 + " b9=" + b9);
        System.out.println();

        //Task10.
        System.out.println("10. Поменять значения двух переменных без использования третей");

        int a = 10;
        int b = 20;
        System.out.println("Before: " +"a=" + a + " b=" + b);

        a = b+a;
        b = a-b;
        a = a-b;
        System.out.println("After:  " +"a=" + a + " b=" + b);

    }
}
