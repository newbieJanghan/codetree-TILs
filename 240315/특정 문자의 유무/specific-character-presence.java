import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.contains("ee")) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }

        if (input.contains("ab")) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }


    }
}