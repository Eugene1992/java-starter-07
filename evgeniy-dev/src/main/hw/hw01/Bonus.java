package hw.hw01;

public class Bonus {
    public static void main(String[] args) {
/*        ---------------------------------------------------- BONUS -------------------------------------------------------------
                Дано число от 0 до 127 в десятичной системе исчисления. Написать программу, которая переводит данное число в двоичную
        систему исчисления и выводит в консоль. Запрещается использовать циклы (for, while и т.д.) или условия(if)! Пример:

        byte b = 103;
        ...
        < Ваш код >
        ...
        Вывод в консоль в следующем виде:
        0110 0111

        Важно чтобы вывод включал в себя все разряды! То есть, даже если число 3 в двоичной системе равно 11, вывод в консоль
        должен быть в ввиде 00000011.*/

        byte x = 115;

        byte a1 = (byte) (x%2);
        byte a2 = (byte) (x/2);
        byte b1 = (byte) (a2%2);
        byte b2 = (byte) (a2/2);
        byte c1 = (byte) (b2%2);
        byte c2 = (byte) (b2/2);
        byte d1 = (byte) (c2%2);
        byte d2 = (byte) (c2/2);
        byte e1 = (byte) (d2%2);
        byte e2 = (byte) (d2/2);
        byte f1 = (byte) (e2%2);
        byte f2 = (byte) (e2/2);
        byte g1 = (byte) (f2%2);
        byte g2 = (byte) (f2/2);
        byte h1 = (byte) (g2%2);

        System.out.println(x);
        System.out.print(h1);
        System.out.print(g1);
        System.out.print(f1);
        System.out.print(e1+" ");
        System.out.print(d1);
        System.out.print(c1);
        System.out.print(b1);
        System.out.print(a1);
    }
}
