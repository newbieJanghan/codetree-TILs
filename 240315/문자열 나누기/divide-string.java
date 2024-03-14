import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String str = "";
        for (int i = 0; i < count; i++) {
            str += sc.next();
        }

        for (int i = 0; i < str.length(); i++) {

            if ((i + 1) % 5 == 0) {
                System.out.println(str.charAt(i));
            } else {
                System.out.print(str.charAt(i));
            }
        }


    }
}