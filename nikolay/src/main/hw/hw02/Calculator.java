package hw02;

import java.util.Scanner;

/**
 * Created by Rain on 24.06.2016.
 *
 * Задание 7
 * Используя IntelliJ IDEA, создайте класс Calculator.
 * Напишите программу - консольный калькулятор.
 * Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
 * Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
 * Выведите на экран результат выполнения арифметической операции.
 * В случае использования операции деления, организуйте проверку попытки деления на ноль.
 * И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
 * пользователя.
 */
public class Calculator {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число первое: ");
        int in = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите число второе: ");
        int in2 = scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите Арифметическую операцию: 1)+ 2)- 3)* 4)/");
        int in3 = scan3.nextInt();






    }
}
