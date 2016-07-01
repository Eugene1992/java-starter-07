package hw02;

import java.util.Scanner;

/**
 * Задание 7
 Используя IntelliJ IDEA, создайте класс Calculator.
 Напишите программу - консольный калькулятор.
 Введите с консоли две переменные. Предложите пользователю ввести знак арифметической операции.
 Для организации выбора алгоритма вычислительного процесса, используйте оператор switch.
 Выведите на экран результат выполнения арифметической операции.
 В случае использования операции деления, организуйте проверку попытки деления на ноль.
 И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке
 пользователя.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b, res;
        String choice;

        System.out.print("Please enter the (a): ");
        if(scan.hasNextFloat()) {
            a = scan.nextFloat();
        } else {
            System.out.println( "You have entered wrong data" );
            return;
        }

        System.out.print("Please enter the (b): ");
        if(scan.hasNextFloat()) {
            b = scan.nextFloat();
        } else {
            System.out.println( "You have entered wrong data" );
            return;
        }

        System.out.println("Select the operation: \n 1. + \n 2. -  \n 3. * \n 4. /");
        choice = scan.next();
        switch(choice){
            case "1":
            case "+":
                res = a + b;
                break;
            case "2":
            case "-":
                res = a - b;
                break;
            case "3":
            case "*":
                res = a * b;
                break;
            case "4":
            case "/":
                if(b == 0){
                    System.err.println("Zero division");
                    return;
                }

                res = a / b;
                break;
            default:
                System.err.println("You have entered wrong operation");
                return;
        }

        System.out.println("Result is " + res);

    }
}
