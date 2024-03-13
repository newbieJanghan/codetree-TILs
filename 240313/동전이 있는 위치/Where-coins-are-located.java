import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();
        int[][] arr2d = new int[n][n];

        for (int round = 0; round < count; round++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr2d[x - 1][y - 1] = 1;
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