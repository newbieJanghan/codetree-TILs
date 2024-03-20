import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String compare = sc.next();

        boolean done = false;

        for (int i=0; i<str.length(); i++) {
            if (str.equals(compare)) {
                System.out.println(i);
                done = true;
                break;
            } else {
                str = str.charAt(str.length()-1) + str.substring(0, str.length()-1);
            }
        }
        if (!done) {
            System.out.println(-1);
        }

    }
}