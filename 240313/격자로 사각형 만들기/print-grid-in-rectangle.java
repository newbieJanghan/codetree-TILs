import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();
        int[][] arr2d = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col == 0 || row == 0) {
                    arr2d[row][col] = 1;
                } else {
                    arr2d[row][col] = arr2d[row - 1][col - 1] + arr2d[row - 1][col] + arr2d[row][col - 1];
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