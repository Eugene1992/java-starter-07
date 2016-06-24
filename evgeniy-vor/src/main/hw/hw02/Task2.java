class Task2 {
    public static void main(String [] args){

      /*  Задание 2
        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        консоли целое число, чётным либо нечётным.*/

        boolean detector = false;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        String str =scan.next();

        //Verification  of number
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                detector = true;
            }else{
                System.out.println("Error, we get string");
                detector = false;
                break;
            }
        }
        if(detector){
            int number = Integer.parseInt(str);
            int a =number%2;

            if(a == 1){
                System.out.println("Congratulations, you typed uneven number");
            }else{
                System.out.println("Congratulations, you typed even number");
            }
        }
        //restart
        Task2.main(args);
    }
}