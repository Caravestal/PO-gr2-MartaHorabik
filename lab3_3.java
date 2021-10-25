import java.util.Random;

public class Start {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(10);
        int m = r.nextInt(10);
        int k = r.nextInt(10);
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        System.out.println("wylosowana liczba m: " + m);
        System.out.println("wylosowana liczba n: " + n);
        System.out.println("wylosowana liczba k: " + k);
        //matrix a: mxn | matrix b: nxk
        System.out.println("matrix a:");
        for (int i = 0; i < m; i++) {
            for (int c = 0; c < n; c++) {
                System.out.println(a[i][c] = 2 * (i + c));
            }
            System.out.println();
        }
        System.out.println("matrix b:");
        for (int i = 0; i < n; i++) {
            for (int c = 0; c < k; c++) {
                System.out.println(b[i][c] = 2 * (i + c));
            }
            System.out.println();
        }
    }
}
