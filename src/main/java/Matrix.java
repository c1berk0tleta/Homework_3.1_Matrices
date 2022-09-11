import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static Scanner num = new Scanner(System.in);
    int a,b,c;
    int[][] array,array2;

    public Matrix(int a, int b) {
        Random random = new Random();
        this.a = a;
        this.b = b;
        int[][] array = new int[a][b];
        int[][] array2 = new int[a][b];

        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(25);
                System.out.print(array[i][j] + " ");
            }
            
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = random.nextInt(10);
                System.out.print(array2[i][j] + " ");
            }
            
            System.out.println();
        }
        this.array = array;
        this.array2 = array2;
    }

    public void plusMatrix(int[][] array, int[][] array2) {
        int[][] arrays = new int[a][b];
        
        for (int i = 0; i < array.length; i++) {
            
            for (int j = 0; j < array[i].length; j++) {
                arrays[i][j] = array[i][j] + array2[i][j];
                System.out.print(arrays[i][j] + " ");
            }
            
            System.out.println();
        }
    }

    public void multiNumber(int[][] array, int c) {
        this.c = c;
        int[][] multi = new int[a][b];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                multi[i][j] = array[i][j] * c;
                System.out.print(multi[i][j] + " ");
            }
            
            System.out.println();


        }
    }

    //Вывод на печать
    public static Scanner text = new Scanner(System.in);

    public void multiMatrix(int[][] array, int[][] array2) {
        int[][] d = new int[a][b];
        int e = 0;

        for (int i = 0; i< array.length;i++){
            
            for(int j = 0;j < array[i].length;j++){
                
                for(int k = 0; k < array[i].length;k++){
                    e = e + array[i][k] * array2[k][j];
                }
                
                d[i][j] = e;
                e = 0;
                System.out.print(d[i][j] + " ");
            }
            
            System.out.println();
        }

    }

}

