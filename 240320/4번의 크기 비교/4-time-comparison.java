import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(a>b ? 1 : 0);
        System.out.println(a>c ? 1 : 0);
        System.out.println(a>d ? 1 : 0);
        System.out.println(a>e ? 1 : 0);

    }
}