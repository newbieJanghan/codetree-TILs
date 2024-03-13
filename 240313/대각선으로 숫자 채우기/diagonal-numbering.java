import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr2d = new int[n][m];

        int maxRowIdx = n - 1;
        int maxColIdx = m - 1;
        int col = 0, row = 0;

        for (int i = 0; i < n * m; i++) {
            int number = i + 1;
            // System.out.println("(" + row + "," + col + ")" + " = " + number);

            arr2d[row][col] = number;


            // 마지막 인덱스
            if (col + 1 == m && row + 1 == n) {
                break;
            }

            // 첫 라운드
            if (col == 0 && row == 0) {
                col++;
                continue;
            }

            // 대각선 진행이 끝났을 때
            if (col == 0 || row == maxRowIdx) {

                // 첫 줄에서 시작할 수 없는 경우
                int nextColIdx = col + row + 1;
                if (nextColIdx > maxColIdx) {
                    row = nextColIdx - maxColIdx;
                    col = maxColIdx;

                    continue;
                } else {
                    col += row + 1;
                    row = 0;

                    continue;
                }
            }

            col--;
            row++;


        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}