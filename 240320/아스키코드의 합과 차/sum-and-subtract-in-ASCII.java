import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");

        int a = (int) arr[0].charAt(0);
        int b = (int) arr[1].charAt(0);

        System.out.print((a+b) + " " + Math.abs(a-b));
    }
}