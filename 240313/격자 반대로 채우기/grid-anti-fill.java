import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();
        int[][] arr2d = new int[n][n];
        int cnt = 1;

        for (int col = n - 1; col >= 0; col--) {
            if ((n - col) % 2 == 0) {
                for (int row = 0; row <= n - 1; row++) {
                    arr2d[row][col] = cnt;
                    cnt++;
                }
            } else {
                for (int row = n - 1; row >= 0; row--) {
                    arr2d[row][col] = cnt;
                    cnt++;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//System.out.println("(" + row + "," + col + ") " + cnt);