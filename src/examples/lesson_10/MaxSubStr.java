package lesson_10;

public class MaxSubStr {
    public static void main(String[] args) {
        System.out.println(getMaxSubString("Hello", "Helloween"));
        System.out.println(getMaxSubString("Helloween", "Hello"));
    }

    static String getMaxSubString(String str1, String str2){
        char[] chars = str1.toCharArray();

        String res = "";
        String cur;

        for (int i = 0; i < chars.length; i++) {
            cur = "";
            for (int j = i; j < chars.length; j++) {
                cur = cur + chars[j];
                if (str2.contains(cur) && cur.length() > res.length()){
                    res = cur;
                }
            }
        }
        return res;
    }
}
