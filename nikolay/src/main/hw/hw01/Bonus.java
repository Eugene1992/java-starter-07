package hw01;

/**
 * Created by Rain on 23.06.2016.
 */
public class Bonus {
    public static void main(String[] args) {

/*Дано число от 0 до 127 в десятичной системе исчисления. Написать программу, которая переводит данное число в двоичную
систему исчисления и выводит в консоль. Запрещается использовать циклы (for, while и т.д.) или условия(if)! Пример:*/

        byte b = 103;

        byte c0 = (byte) (b % 2);
        byte n0 = (byte) (b / 2);

        byte c1 = (byte) (n0 % 2);
        byte n1 = (byte) (n0 / 2);

        byte c2 = (byte) (n1 % 2);
        byte n2 = (byte) (n1 / 2);

        byte c3 = (byte) (n2 % 2);
        byte n3 = (byte) (n2 / 2);

        byte c4 = (byte) (n3 % 2);
        byte n4 = (byte) (n3 / 2);

        byte c5 = (byte) (n4 % 2);
        byte n5 = (byte) (n4 / 2);

        byte c6 = (byte) (n5 % 2);
        byte n6 = (byte) (n5 / 2);

        System.out.print(c6);
        System.out.print(c5);
        System.out.print(c4);
        System.out.print(c3);
        System.out.print(c2);
        System.out.print(c1);
        System.out.print(c0);


        /*Вывод в консоль в следующем виде:
        0110 0111*/

     /*Важно чтобы вывод включал в себя все разряды! То есть, даже если число 3 в двоичной системе равно 11, вывод в консоль
        должен быть в ввиде 00000011.*/
    }
}
