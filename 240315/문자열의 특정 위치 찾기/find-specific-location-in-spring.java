import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String c = sc.next();

        int idx = t.indexOf(c);
        if (idx >= 0) {
            System.out.print(idx);
        } else {
            System.out.print("No");
        }


    }
}