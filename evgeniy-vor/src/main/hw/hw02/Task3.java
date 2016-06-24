public class Task3 {

    static boolean detector;
    static float firstNumber;
    static float secondNumber;
    static float resultNumber;

    public static void main(String [] args){

       /* Задание 3
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the two numbers: ");
        String str1 =scan.next();
        String str2 =scan.next();

        if(verification(str1) & verification(str2)) {
            setNumber(str1, str2);
        }else{
            System.out.println("Error, not all symbols in numbers");
        }
    }
    static boolean  verification(String str){
        //Verification  of number
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                detector = true;
            }else{
                if(str.charAt(i) == '.'){
                }else{
                    System.out.println("Error, we get string");
                    detector = false;
                    break;
                }
            }
        }
        if(detector) return true;
        return false;
    }
    static void setNumber(String str1, String str2){

        firstNumber = Float.parseFloat(str1);
        secondNumber = Float.parseFloat(str2);


        if(firstNumber < 10 & secondNumber < 10){
            if(firstNumber > secondNumber){
                resultNumber = firstNumber;
            }else{
                resultNumber = secondNumber;
            }

        }else if(firstNumber > 10 & secondNumber > 10){
            if(firstNumber < secondNumber){
                resultNumber = firstNumber;
            }else{
                resultNumber = secondNumber;
            }
        }else if(firstNumber > 10 & secondNumber < 10){
            float first = firstNumber - 10;
            float second = 10 - secondNumber;

            if(first < second){
                resultNumber = firstNumber;
            }else{
                resultNumber = secondNumber;
            }

        }else if(firstNumber < 10 & secondNumber > 10){
            float first = 10 - firstNumber;
            float second = secondNumber - 10;

            if(first < second){
                resultNumber = firstNumber;
            }else{
                resultNumber = secondNumber;
            }
        }

        System.out.println(resultNumber);
    }
}
