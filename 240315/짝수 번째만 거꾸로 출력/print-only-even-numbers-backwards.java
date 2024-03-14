import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();
        int len = array.length;

        for (int i = len - 1; i >= 0; i--) {
            if (len == 1) {
                break;
            }
            if ((len - i) % 2 == 1) {
                System.out.print(array[i]);
            }
        }

    }
}