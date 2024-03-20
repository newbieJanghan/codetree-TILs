import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String str = sc.next();
        int qn = sc.nextInt();

        for (int i=0; i<qn; i++) {
            int type = sc.nextInt();

            switch (type) {
                case 1:
                    int firstIdx = sc.nextInt() - 1;
                    int secondIdx = sc.nextInt() - 1;

                    char firstChar = str.charAt(firstIdx);
                    char secondChar = str.charAt(secondIdx);

                    char[] charArr = str.toCharArray();
                    charArr[firstIdx] = secondChar;
                    charArr[secondIdx] = firstChar;
                    str = new String(charArr);

                    break;
                case 2:
                    String from = sc.next();
                    String to = sc.next();
                    str = str.replaceAll(from, to);

                    break;
            }

            System.out.println(str);
        }
    }
}