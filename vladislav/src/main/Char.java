/**
 * Created by Student on 7/4/2016.
 */
public class Char {
    public static void main(String[] args) {
/*        String s1 = "Hello world! ";
        System.out.println(res(s1));
    }

    static String res(String s1) {
        char[] chars = s1.toCharArray();
        String res = "";
        String cur = "";

        for (int i = (s1.length()-1); i > 0 ; i--) {
            cur += chars[i];
                res = cur;
        }
        return res;*/

        String name = "Hello world";
        String firstName = "";
        firstName = name.substring(3, 5);
        System.out.println(firstName);
    }
}


