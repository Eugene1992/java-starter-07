package com.hw03;

import java.util.Scanner;

public class Task6 {
    public static void main(String [] args) {

        /*6. Написать программу, которая реализует следующий функционал:
        6.1 Пользователь вводит число в 10-ой системе счисления.
        6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
        1) в 2-ую
        2) в 8-ую
        3) в 16-ую
        6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
        на экран результат.*/

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int b = in.nextInt();
        System.out.print("Please enter the scale of notation: ");
        int scale = in.nextInt();


        String res = "";
        int balance;

        if (b <= 127) {
            for (int j = 0; j < 8; j++) {
                balance = b % scale;
                b = b / scale;

                if (scale == 16 & balance >= 10 & balance <= 15) {
                    switch (balance) {
                        case 10:
                            res = "A" + res;
                            break;
                        case 11:
                            res = "B" + res;
                            break;
                        case 12:
                            res = "C" + res;
                            break;
                        case 13:
                            res = "D" + res;
                            break;
                        case 14:
                            res = "E" + res;
                            break;
                        case 15:
                            res = "F" + res;
                            break;
                    }
                } else {
                    res = balance + res;
                }
            }
        } else if (b <= 32767 & b > 127) {
            for (int j = 0; j < 16; j++) {
                balance = b % scale;
                b = b / scale;

                if (scale == 16 & balance >= 10 & balance <= 15) {
                    switch (balance) {
                        case 10:
                            res = "A" + res;
                            break;
                        case 11:
                            res = "B" + res;
                            break;
                        case 12:
                            res = "C" + res;
                            break;
                        case 13:
                            res = "D" + res;
                            break;
                        case 14:
                            res = "E" + res;
                            break;
                        case 15:
                            res = "F" + res;
                            break;
                    }
                } else {
                    res = balance + res;
                }
            }
        } else if (b <= 2147483647 & b > 32767) {
            for (int j = 0; j < 32; j++) {
                balance = b % scale;
                b = b / scale;

                if (scale == 16 & balance >= 10 & balance <= 15) {
                    switch (balance) {
                        case 10:
                            res = "A" + res;
                            break;
                        case 11:
                            res = "B" + res;
                            break;
                        case 12:
                            res = "C" + res;
                            break;
                        case 13:
                            res = "D" + res;
                            break;
                        case 14:
                            res = "E" + res;
                            break;
                        case 15:
                            res = "F" + res;
                            break;
                    }
                } else {
                    res = balance + res;
                }
            }
        }

        //cut string
        while (res.startsWith("0")){
            res = res.substring(1);
        }
        System.out.println(res);
    }
}
