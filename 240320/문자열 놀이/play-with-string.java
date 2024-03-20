import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        String str = inputArr[0];
        int qn = Integer.parseInt(inputArr[1]);

        for (int i=0; i<qn; i++) {
            inputArr = br.readLine().split(" ");
            int type = Integer.parseInt(inputArr[0]);

            switch (type) {
                case 1:
                    int firstIdx = Integer.parseInt(inputArr[1]) - 1;
                    int secondIdx = Integer.parseInt(inputArr[2]) - 1;

                    char firstChar = str.charAt(firstIdx);
                    char secondChar = str.charAt(secondIdx);

                    char[] charArr = str.toCharArray();
                    charArr[firstIdx] = secondChar;
                    charArr[secondIdx] = firstChar;
                    str = new String(charArr);

                    break;
                case 2:
                    String from = inputArr[1];
                    String to = inputArr[2];
                    str = str.replaceAll(from, to);

                    break;
            }

            System.out.println(str);
        }
    }
}