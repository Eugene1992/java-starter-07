package com.hw03;

public class HomeWork03 {
    public static void main(String[] args) {

        //1. Создайте программу, выводящую на экран все четырёхзначные числа
        // последовательности 1000 1003 1006 1009 1012 1015 ….
        System.out.println("Task1:");

        for (int i = 1000; i <= 9999; i += 3) {

            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();


        //2. Создайте программу, выводящую на экран первые 55 элементов
        // последовательности 1 3 5 7 9 11 13 15 17 ….
        System.out.println("Task2:");


        for (int i = 1; i < 56; i += 2) {

            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //3. Создайте программу, выводящую на экран все неотрицательные элементы
        // последовательности 90 85 80 75 70 65 60 ….
        System.out.println("Task3:");

        for (int i = 90; i >= 0; i -= 5) {

            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        //4. Создайте программу, выводящую на экран первые 20 элементов
        // последовательности 2 4 8 16 32 64 128 ….
        System.out.println("Task4:");

        int a = 20;
        int b = 1;
        while (a < 21) {
            if (a > 0) {
                b = b * 2;
                System.out.print(b + " ");
                a--;
            } else {
                break;
            }
        }
        System.out.println();
        System.out.println();

        //5. Выведите на экран первые 20 членов последовательности Фибоначчи.
        System.out.println("Task5:");

        int c = 1;
        int d = 1;
        int result;
        System.out.print(c + " " + d + " ");
        for (int i = 0; i < 18; i++) {
            result = c + d;
            c = d;
            d = result;
            System.out.print(result + " ");
        }
        System.out.println();
        System.out.println();

       // 7. Выведите в консоль "шахматную доску" размером 32х32 знаков(пробелы не учитывать). Например:
        System.out.println("Task7:");

        for(int i = 0; i < 32; i++){
            if(i < 4 | (i < 12 & i > 7) | (i > 15 & i < 20) | (i > 23 & i < 28) ){
                for(int j = 0; j < 4; j++){
                    for(int f = 0; f < 4; f++) {
                        System.out.print(" X ");
                    }
                    for(int n = 0; n < 4; n++) {
                        System.out.print(" - ");
                    }
                }
            }else{
                for(int j = 0; j < 4; j++){
                    for(int n = 0; n < 4; n++) {
                        System.out.print(" - ");
                    }
                    for(int f = 0; f < 4; f++) {
                        System.out.print(" X ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        //8. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.
        System.out.println("Task8:");

        int fact = 5;
        int resFact = 1;
        for(int i = 1; i <= fact; i++){
            resFact = i *resFact;
        }

        System.out.println(resFact);
        System.out.println();

        //9. Выведите на экран все положительные делители натурального числа, введенного пользователем.
        System.out.println("Task9:");

        int e = 10;
        int res;

        for(int i = 1; i < e+1; i++ ){
            res = e%i;
            if(res == 0){
                res = i;
                System.out.print(res + " ");
            }
        }

    }
}
