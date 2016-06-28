
import java.util.Scanner;
public class Interval {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 0 до 100");
        int i = scan.nextInt();
        if (i == 0 || i > 0 & i < 15) {
            System.out.println("Ваше число в диапазоне [0 - 14]");
            }  if (i == 15 || i > 15 & i < 36) {
            System.out.println("Ваше число в диапазоне [15 - 35]");
            }  if (i == 36 || i > 36 & i < 51) {
            System.out.println("Ваше число в диапазоне [36 - 50]");
            }  if (i == 50 || i > 50 & i < 101) {
            System.out.println("Ваше число в диапазоне [50 - 100]");
            } else {
            System.out.println("Ваше число не попадает в диапазоне 0 до 100");
        }

    }
}
