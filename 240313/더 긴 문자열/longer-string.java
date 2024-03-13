import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();

        if (first.length() == second.length()) {
            System.out.print("same");
        } else if (first.length() > second.length()) {
            System.out.print(first + " " + first.length());
        } else {
            System.out.println(second + " " + second.length());
        }


    }
}