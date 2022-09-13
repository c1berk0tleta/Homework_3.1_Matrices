public class Main {
    public static void main(String[] args) {
        
        Matrix mx  = new Matrix (3,3);
        Matrix mx2 = new Matrix (3,3);
        Matrix mx3,mx4,mx5,mx6;

        mx.output();
        mx2.output();

        System.out.println("Сложение матриц");
        mx3 = mx.plusMatrix(mx2);
        mx3.output();

        System.out.println("Умножение матрицы #1 на число 3");
        mx4 = mx.multiNumber(4);
        mx4.output();
        System.out.println("Умножение матрицы #3 на число 3");
        mx5 = mx2.multiNumber(4);
        mx5.output();

        System.out.println("Умножение матриц");
        mx6 = mx.multiMatrix(mx2);
        mx6.output();
    }


}

