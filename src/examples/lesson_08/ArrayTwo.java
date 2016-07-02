package lesson_08;

/**
 * Created by Student on 7/2/2016.
 */
public class ArrayTwo {
    public static void main(String[] args) {

        /*//             0  1  2  3   4  5
        int[] arr1D = {2, 3, 4, 12, 5, 75};

        *//*for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i] + " ");
        }*//*

        int[][] arr2D = new int[][]{
        //        0  1  2
            *//*0*//*{2, 3, 5},
            *//*1*//*{4, 6, 6},
            *//*2*//*{4, 6, 6}
        };

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }*/


        arrayDiagonal();

    }

    public static void arrayDiagonal(){
        byte arr[][] = new byte[5][5];

        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = (byte)(Math.random() * 10);
            }
        }

        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                System.out.print( arr[i][j] + " " );
            }

            System.out.println();
        }

        System.out.println();
//   \ - diagonal
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                if( i == j ){
                    System.out.print( arr[i][j] + " " );
                } else {
                    System.out.print( "  " );
                }
            }

            System.out.println();
        }

        System.out.println();

//   / - diagonal
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                if( arr.length - i == j + 1 ){
                    System.out.print( arr[i][j] + " " );
                } else {
                    System.out.print( "  " );
                }
            }

            System.out.println();
        }

        System.out.println();

// X - diagonals
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                if( i == j || arr.length - i == j + 1){
                    System.out.print( arr[i][j] + " " );
                } else {
                    System.out.print( "  " );
                }

            }

            System.out.println();
        }

        System.out.println();

// X - diagonals in the box
        for(int i = 0; i < 5; i ++){
            for(int j = 0; j < 5; j++){
                if( i == j || arr.length - i == j + 1 || i == 0 || j == 0 || i == arr.length - 1 || j == arr[i].length - 1){
                    System.out.print( arr[i][j] + " " );
                } else {
                    System.out.print( "  " );
                }

            }

            System.out.println();
        }
    }
}
