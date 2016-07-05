import java.util.Arrays;

/**
 * Created by Student on 7/5/2016.
 */
public class Hel {
    public static void main(String[] args) {
        String s1 = "Bellowee";
        String s2 = "Helloween";


       System.out.println(getSub(s1, s2));
    }

    static String getSub(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        String res = "";
        String firstName = "";
            for (int i = 0; i < chars1.length ; i++) {
                for (int j = 0; j < chars2.length ; j++) {
                    if ( chars1[i] > chars2[j]) {
                        char tmp = chars1[i];
                        chars1[i] = chars2[j];
                        chars2[j] = tmp;
                    }
                }

//                firstName = s1.substring(0, i);
//                firstName.equals(s2);
//                res += firstName + " ";

            }

 /*       for (int i = 0; i < chars1.length; i++) {
            cur = "";
            for (int j = i; j < chars1.length; j++) {
                cur = cur + chars1[j];
                if (s2.contains(cur) && cur.length() > res.length()) {
                    res = cur;


                }
            }
        }*/
        return res;
    }
}