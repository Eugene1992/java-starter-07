package hw01;

public class Solution {
    public static void main(String[] args) {
        //1. Создать четыре целочисленные переменные типов byte, short, int, long.
        byte b = 127;
        short s = 256;
        int i = 809203;
        long l = 100000;

        //2. Инициализировать переменную типа byte результатом суммы двух любых чисел
        b = 12 + 7;

        //3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
        s = 7 - 12;

        //4. Инициализировать переменную типа int результатом деления двух любых чисел
        i = 16/4;

        //5. Инициализировать переменную типа long результатом умножения двух любых чисел
        l = 20000*16;

        //6. Передать перменной типа byte результат суммы двух переменной типа byte
        byte sumByte = (byte)(b + b);

        //7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
        byte sumAndDiv = (byte)((s+s)/2);

        //8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        i = (s/s)*(sumByte/b);

        //9. Поменять значения двух целочисленных переменных используя третью
        int first, second, third;
        first = 10;
        second = 15;

        System.out.println("Before:");
        System.out.println("first: " + first + " " + "second: " + second);
        third = second;
        second = first;
        first = third;
        System.out.println("After:");
        System.out.println("first: " + first + " " + "second: " + second);

        //10. Поменять значения двух переменных без использования третей
        System.out.println("-------------------------------------------");
        System.out.println("Before:");
        System.out.println("first: " + first + " " + "second: " + second);
        second = first + second;
        first = second - first;
        second = second - first;
        System.out.println("After:");
        System.out.println("first: " + first + " " + "second: " + second);


        /* ---------------------------------------------------- BONUS -------------------------------------------------------------
                Дано число от 0 до 127 в десятичной системе исчисления. Написать программу, которая переводит данное число в двоичную
        систему исчисления и выводит в консоль. Запрещается использовать циклы (for, while и т.д.) или условия(if)! Пример:

        byte b = 103;
        ...
        < Ваш код >
        ...
        Вывод в консоль в следующем виде:
        0110 0111

        Важно чтобы вывод включал в себя все разряды! То есть, даже если число 3 в двоичной системе равно 11, вывод в консоль
        должен быть в ввиде 00000011.
                ------------------------------------------------------------------------------------------------------------------------*/

        System.out.println("-------------------------------------------");
        byte xD = 127;
        System.out.println("Digit: " + xD);
        int bit0 = xD % 2;
        int bit1 = xD/2 % 2;
        int bit2 = xD/4 % 2;
        int bit3 = xD/8 % 2;
        int bit4 = xD/16 % 2;
        int bit5 = xD/32 % 2;
        int bit6 = xD/64 % 2;
        int bit7 = xD/128 % 2;
        System.out.print(bit7);
        System.out.print(bit6);
        System.out.print(bit5);
        System.out.print(bit4);
        System.out.print(bit3);
        System.out.print(bit2);
        System.out.print(bit1);
        System.out.print(bit0);
    }
}
