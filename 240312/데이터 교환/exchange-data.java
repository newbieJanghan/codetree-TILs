public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5, b = 6, c = 7;
        int b1 = a, c1 = b, a1 = c;
        b = b1;
        c = c1;
        a = a1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}