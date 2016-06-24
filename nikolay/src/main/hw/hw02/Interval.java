package hw02;

import java.util.Scanner;

/**
 * Created by Rain on 24.06.2016.
 * <p>
 * Задание 8
 * Используя IntelliJ IDEA, создайте класс Interval.
 * Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
 * промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
 * Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
 * выводится соответствующее сообщение.
 */
public class Interval {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число от 0 до 100: ");

        int number = scan.nextInt();

        if (number <= 14) {
            System.out.print(number + " входит в числовой промежуток [0 - 14]");
        } else if (number >= 15 && number <= 35) {
            System.out.print(number + " входит в числовой промежуток [15 - 35]");
        } else if (number >= 36 && number <= 50) {
            System.out.print(number + " входит в числовой промежуток [36 - 50]");
        } else if (number >= 50 && number <= 100) {
            System.out.print(number + " входит в числовой промежуток [50 - 100]");
        } else {
            System.out.println(number + " не входит в имеющийся числовые промежутки!");
        }

    }
}
