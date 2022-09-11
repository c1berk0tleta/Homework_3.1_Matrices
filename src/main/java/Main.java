public class Main {
    public static void main(String[] args) {
        
        System.out.println("Введите значение матрицы №1 и №2 (через Enter)");
        Matrix mat = new Matrix(Matrix.num.nextInt(), Matrix.num.nextInt());
            System.out.println();

        System.out.println("Сложение матриц");
        mat.plusMatrix(mat.array,mat.array2);
            System.out.println();

        System.out.println("Укажите число, умножаемое №1 и №2");
        mat.multiNumber(mat.array, Matrix.num.nextInt());
            System.out.println();
        mat.multiNumber(mat.array2, mat.c);
            System.out.println();

        System.out.println("Введите текст для вывода на печать");
        Matrix.text.nextLine();

        System.out.println("Умножение матриц");
        mat.multiMatrix(mat.array,mat.array2);
            System.out.println();
        
    }


}

