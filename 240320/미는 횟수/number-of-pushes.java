import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String compare = sc.next();

        for (int i=0; i<str.length(); i++) {
            if (str.equals(compare)) {
                System.out.println(i);
                break;
            } else {
                str = str.substring(1) + str.charAt(0);
            }
        }
        System.out.println(-1);

    }
}