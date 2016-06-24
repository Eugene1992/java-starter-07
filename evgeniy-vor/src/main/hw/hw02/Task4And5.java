public class Task4And5 {


    public static void main(String [] args){
        /* Задание 4
       Задано три переменных, найти и вывести на экран переменную с максимальным значением
            (значения всех переменных разные).*/

        int a = 50;
        int b = 25;
        int c = 125;
        int d = 45;

        List list = new ArrayList();
        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println("MaxNumber result: " + Collections.max(list));

        /*Задание 5
        Задано четыре переменных, найти и вывести на экран вторую по величине.*/

        list.add(d);
        String maxN = Collections.max(list)+"";

        int maxNumber = Integer.parseInt(maxN);

        if(maxNumber-a == 0){
            list.remove(0);
        }else if(maxNumber-b == 0){
            list.remove(1);
        }else if(maxNumber-c == 0){
            list.remove(2);
        }else{
            list.remove(3);
        }
        System.out.println("Second MaxNumber result: " + Collections.max(list));


    }
}