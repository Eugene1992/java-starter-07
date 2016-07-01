package lesson_05;

public class ToDecConverter {
    public static void main(String[] args) {
       int num = 0;
       String res = "";

        while (true){
            if (num == 0) {
                res = 0 + res;
                break;
            }
            if (num == 1){
                res = 1 + res;
                break;
            } else {
                res = num % 2 + res;
                num = num / 2; // num /= 2;
            }
        }

        int resLength = res.length();
        int zeros = 0;

        if (resLength < 8){
            zeros = 8 - resLength;
        } else if (resLength > 8 && resLength <= 16){
            zeros = 16 - resLength;
        } else if (resLength > 16 && resLength <= 32){
            zeros = 32 - resLength;
        } else if (resLength > 32 && resLength <= 64){
            zeros = 64 - resLength;
        }

        for (int i = 0; i < zeros; i++) {
            res = 0 + res;
        }

        System.out.println(res);

    }
}
