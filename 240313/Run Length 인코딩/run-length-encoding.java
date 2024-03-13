import java.util.*;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.next().toCharArray();

        String encoded = "";
        char accChar = 0;
        int accCount = 0;

        for (int i = 0; i < chars.length; i++) {

            if (i == 0) {
                accChar = chars[i];
                accCount++;
            } else {
                if (accChar == chars[i]) {
                    accCount++;
                } else {
                    encoded += accChar;
                    encoded += accCount;

                    accChar = chars[i];
                    accCount = 1;
                }
            }
            
            if (i == chars.length - 1) {
                encoded += accChar;
                encoded += accCount;
            }

        }

        System.out.println(encoded.length());
        System.out.println(encoded);
    }
}