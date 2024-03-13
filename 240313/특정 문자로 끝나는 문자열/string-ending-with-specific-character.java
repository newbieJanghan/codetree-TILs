import java.util.*;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextLine();
        }
        String target = sc.next();

        boolean flag = false;

        for (int i = 0; i < array.length; i++) {
            String cur = array[i];
            if (cur.charAt(cur.length() - 1) == target.charAt(0)) {
                flag = true;
                System.out.println(cur);
            }
        }

        if (!flag) {
            System.out.println("None");
        }

    }
}