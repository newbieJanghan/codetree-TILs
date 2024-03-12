import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        int[][] arr2d1 = new int[3][3];
        int[][] arr2d2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2d1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr2d2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr2d1[i][j] * arr2d2[i][j] + " ");
            }
            System.out.println();
        }
    }
}