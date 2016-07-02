package Lesson4;

/**
 * 1. Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так, что
 слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */
public class Clock {
    public static void main(String[] args) {
        int a, b, counter = 0;

        for(int i = 0; i < 24; i ++){
            a = i % 10;
            b = i / 10;
            counter = (a * 10 + b) < 60 ? ++counter : counter;
            System.out.println( a * 10 + b );
        }

        System.out.println("Result is " + counter);
    }
}
