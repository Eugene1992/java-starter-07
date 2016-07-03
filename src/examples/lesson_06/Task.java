package lesson_06;

public class Task {
    public static void main(String[] args) {
        String s1 = "Ho";
        String s2 = "Helloween";
        System.out.println(getSub(s1, s2));
    }

    static String getSub(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        String res = "";
        String cur = "";

        for (int i = 0; i < chars1.length; i++) {
            cur = "";
            for (int j = i; j < chars1.length; j++) {
                cur = cur + chars1[j];
                if (s2.contains(cur) && cur.length() > res.length()) {
                    res = cur;
                }
            }
        }
        return res;
    }
}
