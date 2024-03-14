import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        char[] array = sc.nextLine().toCharArray();
        int len = array.length;
        int flag = len % 2 == 0 ? 1 : 0;

        for (int i = len - 1; i >= 0; i--) {
            if ((len - i) % 2 == flag) {
                System.out.print(array[i]);
            }
        }

    }
}