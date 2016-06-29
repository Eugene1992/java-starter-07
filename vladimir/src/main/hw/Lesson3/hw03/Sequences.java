package Lesson3.hw03;

/**
 * part 1 - Sequences
 */
public class Sequences {
    public static void main(String[] args) {
//        1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        System.out.println("------------------1000 1003 1006 1009 1012 1015------------------");
        int digit = 1000;
        while( digit / 1000 < 10 ){
            System.out.print(digit + " ");
            digit += 3;

            if(digit % 20 == 0){
                System.out.print("\n");
            }
        }


//        2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        System.out.println("\n------------------1 3 5 7 9 11 13 15 17------------------");
        digit = 1;
        while( digit <= 55 ){
            System.out.print(digit + " ");
            digit += 2;

            if(digit % 20 == 0){
                System.out.print("\n");
            }
        }

//        3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
        System.out.println("\n\n------------------90 85 80 75 70 65 60------------------");
        digit = 90;
        while( digit >= 0 ){
            System.out.print(digit + " ");
            digit -= 5;
        }

//        4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        System.out.println("\n\n------------------2 4 8 16 32 64 128------------------");
        digit = 2;
        for(int i = 0; i < 20; i++){
            System.out.print(digit + " ");
            digit *= 2;
        }

//        5. Выведите на экран первые 20 членов последовательности Фибоначчи.
        System.out.println("\n\n------------------Fibonachi------------------");
        int prevValue = 0;
        digit = 1;
        for(int i = 0; i < 19; i++){
            if(i == 0){
                System.out.print(prevValue + " ");
            }

            System.out.print(digit + " ");

            digit = prevValue + digit;
            prevValue = digit - prevValue;
        }
    }
}
