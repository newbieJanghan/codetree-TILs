import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[][] arr2d = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr2d[i][j];
            }
            System.out.println(sum);
        }
    }
}