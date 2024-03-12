import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr2d = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean isReverse = j % 2 == 1;
                if (isReverse) {
                    System.out.print((n * (j + 1) - (i + 1)) + " ");
                } else {
                    System.out.print((i + j * m) + " ");
                }
            }
            System.out.println();
        }
    }
}