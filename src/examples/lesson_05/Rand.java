package lesson_05;

/**
 * Created by Student on 6/29/2016.
 */
public class Rand {
    public static void main(String[] args) {
        int rand; // [0; 100)
        int orel;
        int rezhka;
        int col = 0;

        for (int i = 0; i < 100; i++) {
            orel = 0;
            rezhka = 0;
            for (int j = 0; j < 100; j++) {
                rand = (int)(Math.random()*100);
                if (rand % 2 == 0){
                    orel++;
                } else {
                    rezhka++;
                }
            }
            //System.out.println("Orel = " + orel + " Rezhka = " + rezhka);
            if (Math.abs(rezhka - orel) > 10){
                col++;
            }
        }
        System.out.println(col);
    }
}
