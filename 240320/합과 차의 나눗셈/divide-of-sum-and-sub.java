import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int dif = a-b;

        float f = (float) (Math.round((double) sum / dif*100))/100;
        System.out.printf("%.2f", f);

    }
}