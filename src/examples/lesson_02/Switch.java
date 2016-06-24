package lesson_02;

/**
 * Created by Student on 6/23/2016.
 */
public class Switch {
    public static void main(String[] args) {
        int k = 1;
        String s = "Oksana";

        /*if (s.equals("Oksana")){
            System.out.println("k == 0");
        }

        if (k == 1){
            System.out.println("k == 1");
        }

        if (k == 2){
            System.out.println("k == 2");
        }

        if (k == 3){
            System.out.println("k == 3");
        }*/

        switch (s){
            case "Oksana":
                System.out.println("k == 0");
                switch (k){
                    case 1:
                        System.out.println(k);
                        break;
                }
                break;

            case "Evgeniy":
                System.out.println("k == 1");
                break;

            case "Nikolay":
                System.out.println("k == 2");
                break;

            case "Vladimir":
                System.out.println("k == 3");
                break;

            default:
                System.out.println("default");

        }

        System.out.println("End");
    }
}
