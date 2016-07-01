package com.example;


import java.util.ArrayList;

public class Encryption {
    public static void main(String[] args) {

        System.out.print(generPass(6));
    }

    static String generPass(int diapason){
        ArrayList<String> arr = new ArrayList<>();

        String pass = "";

        for (char i = 'A'; i <= 'z'; i++){
            String str ="";
            str +=i;

            arr.add(str);
            //Исключаем лишние символы ( ],[,...)
            if (i == 'Z'){
                i = 'a'-1;
            }
        }
        for(int i = 0; i < diapason; i++){
            pass = pass + arr.get((int)(Math.random()*arr.size()));
        }
        return pass;
    }
}
