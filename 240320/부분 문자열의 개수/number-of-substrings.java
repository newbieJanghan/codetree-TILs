public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char[] t = sc.next().toCharArray();
        char[] c = sc.next().toCharArray();

        int count = 0;

        for (int i = 0; i < t.length; i++) {
            for (int j=0; j < c.length; j++) {
                if (t[i+j] != c[j]) {
                    break;
                }
                if (j == c.length-1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}