import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String intA = "0";

        for (int i=0; i<a.length(); i++) {
            if ( '0' <= a.charAt(i) && a.charAt(i) < '9') {
                intA += a.charAt(i);
            } else {
                break;
            }
        }

        String b = sc.next();
        String intB = "0";
        for (int i=0; i<b.length(); i++) {
            if ( '0' <= b.charAt(i) && b.charAt(i) < '9') {
                intB += b.charAt(i);
            } else {
                break;
            }
        }

        System.out.println((Integer.parseInt(intA) + Integer.parseInt(intB)));


    }
}