import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();
        int sum = 0;


        for (int i=0; i<time; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        String str = String.valueOf(sum);

        System.out.println(str.substring(1) + str.charAt(0));


    }
}