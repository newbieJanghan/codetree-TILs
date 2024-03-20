import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        for (int i=0; i<a.length(); i++) {
            if ( a.charAt(i) < '0') {
                a = a.substring(0, i);
                break;
            }
        }

        String b = sc.next();
        for (int i=0; i<b.length(); i++) {
            if ( b.charAt(i) < '0') {
                b = b.substring(0, i);
                break;
            }
        }

        System.out.println((Integer.parseInt(a) + Integer.parseInt(b)));


    }
}