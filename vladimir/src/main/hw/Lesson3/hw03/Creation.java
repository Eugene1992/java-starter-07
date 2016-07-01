package Lesson3.hw03;

/**
 * В этом блоке задач используйте минимальный вывод в строку, то есть "Ж " или "- ", а не целыми строками
 "Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - - Ж Ж Ж Ж - - - -". Комбинируйте вложенными циклами и условиями if или switch.

 7. Выведите в консоль "шахматную доску" размером 32х32 знаков(пробелы не учитывать). Например:
 */
public class Creation {
    public static void main(String[] args) {

        boolean isMinus = true;
        String sign, res = "";
        for (int i = 1; i < 33; i++ ){
            for (int j = 0; j < 32; j++ ){
                if(j % 4 == 0 ){
                    isMinus = !isMinus;
                }

                sign = isMinus ? "- " : "X ";
                res += sign;
            }

            if(i % 4 == 0){
                isMinus = !isMinus;
            }

            res += "\n";
        }

        System.out.print(res);
    }
}
