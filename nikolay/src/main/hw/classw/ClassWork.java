package classw;

/**
 * Created by Rain on 24.06.2016.
 */
public class ClassWork {
    public static void main(String[] args) {
        // Class Work № 1 - вывод чисел от 0 до 100 деленное на 3
        for (int i = 0; i < 100; i++) {

            if (i % 3 == 0) {
                System.out.println(i);
            }

        }


        // Class Work № 2 - перевод с десятичного числа в двоичное
        String res = " ";
        int c;
        for (int i = 130; i != 0; ) {

            c = i % 2;
            System.out.print(c + res);

            i = i / 2;
        }
    }
}
