import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr2d = new int[n][m];

        int x = 1, y = 1;

        for (int i = 0; i < n * m; i++) {
            int number = i + 1;

            arr2d[y - 1][x - 1] = number;

            if (n > m) {
                if (x == 1) {
                    x++;
                } else if (x == m) {
                    x = 1;
                    y++;
                } else {
                    x--;
                    y++;
                }
            } else {
                if (y != n && x == 1) {
                    x = y + 1;
                    y = 1;
                } else if (y == n) {
                    x += n;
                    y = 1;
                    if (x > m) {
                        y += x - m;
                        x = m;
                    }
                } else {
                    x--;
                    y++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}