
// задача 7
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int i = scan.nextInt();
        int o = scan.nextInt();
        System.out.println("Введите знак арифметической операции");
        String a = scan.next();
        switch (a) {
            case "-":
                long a1 = i - o;
                System.out.println("Равно");
                System.out.println(a1);
                break;
            case "+":
                long a2 = i + o;
                System.out.println("Равно");
                System.out.println(a2);
                break;
            case "*":
                long a3 = i * o;
                System.out.println("Равно");
                System.out.println(a3);
                break;
            case "/":
                if (o == 0) {
                    System.out.println("Деление на ноль невозможно");
                } else {
                long a4 = i / o;
            System.out.println("Равно");
            System.out.println(a4);
                }
            break;

        }
    }
}


// 1