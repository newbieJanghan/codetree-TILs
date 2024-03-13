import java.util.*;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        String[] array = new String[count];
        for (int i = 0; i < count; i++) {
            array[i] = sc.next();
        }

        String cc = sc.next();

        int totalCount = 0;
        int totalLength = 0;

        for (String cur : array) {
            if (cur.startsWith(cc)) {
                totalCount++;
                totalLength += cur.length();
            }
        }
        
        float average = (float) totalLength / totalCount * 100 / 100;
        System.out.print(totalCount + " ");
        System.out.printf("%.2f", average);
    }
}