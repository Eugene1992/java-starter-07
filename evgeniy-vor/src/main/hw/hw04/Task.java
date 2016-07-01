package com.hw04;


public class Task {

    public static void main(String [] args) {
        //1. Электронные часы показывают время в формате от 00:00 до 23:59.
        // Подсчитать сколько раз за сутки случается так, что
        //слева от двоеточия показывается симметричная комбинация для той,
        // что справа от двоеточия (например, 02:20, 11:11 или 15:51).

        //  String time ="";
        String hours = "";
        String minutes = "";
        //  String minutesRevers = "";
        int count = 0;

        for(int i = 0; i <= 23; i++){
            for(int j = 0; j <= 59; j++){
                String minutesRevers = "";

                if(i < 10){
                    if(j < 10){
                        // System.out.println("0" + i + ":" + "0" + j);
                        //    time = "0" + i + ":" + "0" + j;
                        hours = "0" + i;
                        minutes = "0" + j;

                    }else{
                        //  System.out.println("0" + i + ":" + j);
                        //    time = "0" + i + ":" + j;
                        hours = "0" + i;
                        minutes = j + "";

                    }
                }else{
                    // System.out.println(i + ":" + j);
                    //   time = i + ":" + j;
                    hours = i +"";

                    if(j < 10){
                        // System.out.println("0" + i + ":" + "0" + j);
                        //    time = "0" + i + ":" + "0" + j;

                        minutes = "0" + j;

                    }else{
                        //  System.out.println("0" + i + ":" + j);
                        //    time = "0" + i + ":" + j;

                        minutes = j + "";
                    }
                }

                for(int k = 0; k < minutes.length(); k++){
                    minutesRevers = minutes.charAt(k) + minutesRevers ;
                }
                if(hours.equals(minutesRevers)){
                    count ++;
                    //      System.out.println("ResultTime = " + hours + ":" + minutes);
                }

                //    System.out.println(hours + ":" + minutes);
                //    System.out.println(hours + ":" + minutesRevers);
                //    System.out.println();
            }
        }

        System.out.println("Result = " + count);
    }
}
