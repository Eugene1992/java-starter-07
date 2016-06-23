package hw01;

/**
 * Created by Rain on 22.06.2016.
 */
public class Solution {
    public static void main(String[] args) {
        //1. Создать четыре целочисленные переменные типов byte, short, int, long.
        byte bt = 120;
        short sh = 10000;
        int in = 1200000000;
        long lng = 1200000000000000000l;

        //2. Инициализировать переменную типа byte результатом суммы двух любых чисел
        bt = 100 + 27;

        //3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
        sh = (short) 199820 - 2982;

        //4. Инициализировать переменную типа int результатом деления двух любых чисел
        in = (int) (19982 / 298300);

        //5. Инициализировать переменную типа long результатом умножения двух любых чисел
        lng = (long) 2000000 * 200;

        //6. Передать перменной типа byte результат суммы двух переменной типа byte
        byte b1 = 70;
        byte b2 = 40;

        byte b3 = (byte) (b1 + b2);

        //7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
        short sh1 = 300;
        short sh2 = 200;
        byte bt3 = 10;

        byte b4 = (byte) ((sh1 + sh2) / bt3);

        //8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
        short shO = 600;
        short shT = 200;
        byte bt4 = 80;
        byte bt5 = 10;

        int numOne = (int) (shO / shT) * (bt4 / bt5);

        //9. Поменять значения двух целочисленных переменных используя третью
        int varOne1 = 10;
        int varTwo2 = 5;
        int varThree;

        varThree = varOne1; //10
        varOne1 = varTwo2; //5
        varTwo2 = varThree; //10

        System.out.println("variablesOne1: " + varOne1);
        System.out.println("variablesTwo2: " + varTwo2);

        //10. Поменять значения двух переменных без использования третей
        int varOne = 10;
        int varTwo = 5;

        varOne = varOne - varTwo; //10-5 = 5
        varTwo = varTwo + varTwo; //5 + 5 = 10
        varOne = varTwo - varOne; //10 - 5 = 5

        System.out.println("variablesOne: " + varOne);
        System.out.println("variablesTwo: " + varTwo);

    }
}
