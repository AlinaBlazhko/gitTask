import java.util.Scanner;

public class Matrix {
    private final int[][] a;

    public Matrix(int n, int m) {
        a = new int[n][m];
    }

    public int[][] fill() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Enter a[" + i + "][" + j + "]");
                a[i][j] = in.nextInt();
            }
        return a;
    }

    public void print() {
        System.out.println("Maтрица : " + a.length + "  " + a[0].length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multipleTwoMatrix(int[][] mA, int[][] mB, int[][] res){
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mB.length; j++) {
                for (int k = 0; k < mB.length; k++) {
                    res[i][j] += mA[i][k] * mB[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
    }
}
