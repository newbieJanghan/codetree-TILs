import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String key = br.readLine();
        boolean flag = true;

        while (flag) {
            int before = str.length();
            str = str.replace(key, "");

            if (before == str.length()) {
                flag = false;
            }
        }

        System.out.println(str);
    }
}