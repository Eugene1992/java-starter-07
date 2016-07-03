package lesson_06;

public class Test {
    public static void main(String[] args) {
        /*printHello();

        String str = "Hello";

        printStringNtimes(str, 12);

        printStringNtimes(str, 2);

        str = str + " world!";

        printStringNtimes(str, 12);

        int k = getNprint(str, 20);

        System.out.println(k);*/

        //String s = concatStrAndDig(20, "Hello", 100.0, true);

        /*printStringNtimes("World", 2);
        System.out.println();
        printStringNtimes("Hello", 2);
        System.out.println();
        printStringNtimes("Hello", 12);

*/
        System.out.println(concatStrAndDig(12, "String", 12.0, true));
    }

    static void printHello(){
        System.out.println("Hello");
    }

    static void printStringNtimes(String str, int quantity){
        if (!str.equals("Hello")) return;
        for (int i = 0; i < quantity; i++) {
            if (i > 5) return;
            System.out.println(str);
        }
        System.out.println("End");
    }

    static int getNprint(String str, int quantity){
        for (int i = 0; i < quantity; i++) {
            System.out.println(str);
        }
        return quantity;
    }

    static String concatStrAndDig(int dig, String str, double d, boolean b){
        String res = str + dig + d + b + getNprint(str, dig);
        return res;
    }


}


