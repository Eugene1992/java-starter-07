package com.hw02;

import java.util.Scanner;

public class Task7 {
    public static void main(String [] args){
        /*Задание 7
        Используя IntelliJ IDEA, создайте класс Calculator.
        Напишите программу - консольный калькулятор.
                Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
        Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
        Выведите на экран результат выполнения арифметической операции.
                В случае использования операции деления, организуйте проверку попытки деления на ноль.
                И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
        пользователя.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();
        System.out.println("Enter the operators for action:");
        String operetor = scan.next();

        int result = 0;
        outer:
        switch (operetor){
            case "/":
                if(b == 0){
                    System.out.println("You can't divide by 0");
                }else{
                    result = a / b;
                    System.out.println("a / b = " + result);
                }
                break;
            case "*":
                result = a * b;
                System.out.println("a * b = " + result);
                break;
            case "+":
                result = a + b;
                System.out.println("a + b = " + result);
                break;
            case "-":
                result = a - b;
                System.out.println("a - b = " + result);
                break;
        }



    }
}
