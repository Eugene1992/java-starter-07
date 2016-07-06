package com.example;


public class MaxSubString {
    public static void main(String[] args) {

        System.out.println(myMaxString("Hello", "Helloween"));
    }

    static String myMaxString(String a, String b) {

        String strMax = "";

        char[] chA = a.toCharArray();
        char[] chB = b.toCharArray();

        int countBreak = chA.length + chB.length;
        int count = 0;
        int countA = 0;
        int countB = chB.length - 1;

        do {
            String str = "";
            for (int i = 0; i < count + 1; i++) {

                if ((i + countB)  < chB.length & (i + countA) < chA.length) {

                        String aa = chA[i + countA] + "";
                        String bb = chB[countB  + i] + "";

                        if (chA[i + countA] == chB[countB + i]) {
                            str = str + chB[countB + i];
                    }
                }
            }
            if (str.toCharArray().length > strMax.toCharArray().length) {
                strMax = str;
            }
            countBreak--;
            count++;
            countB--;
            if(countB < 0){
                countB = 0;
                countA ++;
                count = chA.length-1;
            }
        } while (countBreak > 0);

        return strMax;
    }
}
