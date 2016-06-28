package com.hw02;


import java.util.Scanner;

public class Task8 {
    public static void main(String [] args){

       /* Задание 8
        Используя IntelliJ IDEA, создайте класс Interval.
        Напишите программу определения, попадает ли введенное пользователем число от 0 до 100 в числовой
        промежуток [0 - 14] [15 - 35] [36 - 50] [50 - 100]. Если да, то укажите, в какой именно промежуток.
                Если пользователь указывает число не входящее ни в один из имеющихся числовых промежутков, то
        выводится соответствующее сообщение.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number in diapason from 0 to 100:");
        int a = scan.nextInt();

        if(a >= 0 & a <= 100){
            if(a >= 0 & a <= 14){
                System.out.println("The number in diapason [0 - 14]");
            }else if(a >= 15 & a <= 35){
                System.out.println("The number in diapason [15 - 35]");
            }
            if(a >= 36 & a <= 50){
                System.out.println("The number in diapason [36 - 50]");
            }
            if(a >= 50 & a <= 100){
                System.out.println("The number in diapason [50 - 100]");
            }

        }else{
            System.out.println("Wrong number diapason, please try again");
        }
        Task8.main(args);
    }
}
