package Lesson3.hw03;

import java.util.Scanner;

/**
 * 6. Написать программу, которая реализует следующий функционал:
 6.1 Пользователь вводит число в 10-ой системе счисления.
 6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
 1) в 2-ую
 2) в 8-ую
 3) в 16-ую
 6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
 на экран результат.
 */
public class NumberSystem {
    public static void main(String[] args) {

        long digit = 0;
        byte bitsCount = 0;

        if(digit >= 0 && digit <= 127){ //8bits
            bitsCount = 8;
        } else if(digit >= 0 && digit <= 32767) { //16bits
            bitsCount = 16;
        } else if(digit >= 0 && digit <= 2147483647) { //32bits
            bitsCount = 32;
        } else if(digit >= 0 && digit <= 9223372036854775807L ) { //64bits
            bitsCount = 64;
        } else {
            System.err.println("Sorry. program does not support this digit");
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the value: ");

        if( scan.hasNextLong() ){ //TODO: question about while
            digit = scan.nextLong();
        } else {
            System.err.println("You have entered wrong data");
            return;
        }

        byte choice;
        System.out.println("Please select the system:\n1. 2\n2. 8\n3. 16");
        if( scan.hasNextByte() ){
            choice = scan.nextByte();
        } else {
            System.err.println("You have entered wrong choice");
            return;
        }

        String res = "";
        long iterator = 1;
        byte bit;
        switch(choice){
            case 1:
                while(bitsCount != 0){
                    bit = (byte)(digit / iterator % 2);
                    res = (bitsCount % 4 == 0) ? bit + " " + res : bit + res;
                    iterator *= 2;
                    bitsCount --;
                }

                break;
            case 2:
                while(bitsCount != 0){
                    bit = (byte)(digit / iterator % 8);
                    res = bit + res;
                    iterator *= 8;
                    if(digit < iterator) {
                        break;
                    }

                    bitsCount --;
                }

                break;
            case 3:
                String chVal;
                while(bitsCount != 0){
                    bit = (byte)(digit / iterator % 16);
                    switch(bit){
                        case 10:
                            chVal = "A";
                            break;
                        case 11:
                            chVal = "B";
                            break;
                        case 12:
                            chVal = "C";
                            break;
                        case 13:
                            chVal = "D";
                            break;
                        case 14:
                            chVal = "E";
                            break;
                        case 15:
                            chVal = "F";
                            break;
                        default:
                            chVal = "" + bit;
                    }

                    res = chVal + res;
                    iterator *= 16;
                    if(digit < iterator) {
                        break;
                    }

                    bitsCount --;
                }
                break;
            default:
                break;
        }

        System.out.println("Result is \n" + res);
    }
}
