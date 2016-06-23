class Hw1 {
    public static void main(String[] args) {

//        From 1 to 8

        byte b = 20 + 10;
        short s = 200 - 10;
        int i = 100 / 2;
        long l = 300 * 2;


        byte b1 = 20;
        byte b2 = (byte) (b + b1);
        System.out.println(b2);

        short s1 = 10;
        byte b3 = (byte) ((s + s1) / b1);
        System.out.println(b3);

        int i1 = (int) ((s / s1) * (b / b1));
        System.out.println(i1);

//        9 and 10 I don't understand. BONUS task not did yet

    }
}