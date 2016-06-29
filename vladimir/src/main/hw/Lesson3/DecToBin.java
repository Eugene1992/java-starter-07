package Lesson3;

/**
 * From decimal to binary extended version
 */
public class DecToBin {
    public static void main(String[] args) {
        long digit = 126;
        byte bitsCount = 0;

        if(digit >= 0 && digit <= 127){ //8bits
            bitsCount = 8;
        } else if(digit >= 0 && digit <= 32767) { //16bits
            bitsCount = 16;
        } else if(digit >= 0 && digit <= 2147483647) { //32bits
            bitsCount = 32;
        } else if(digit >= 0 && digit <= 9223372036854775807L ) { //64bits
            bitsCount = 64;
        } else {
            System.out.println("Sorry. program does not support this digit");
        }

        String res = "";
        long iterator = 1;
        byte bit;
        while(bitsCount != 0){
            bit = (byte)(digit / iterator % 2);
            res = (bitsCount % 4 == 0) ? bit + " " + res : bit + res;
            iterator *= 2;
            bitsCount --;
        }

        System.out.println(res);

    }
}
