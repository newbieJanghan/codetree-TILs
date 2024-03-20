import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        String str = inputArr[0];
        int len = Integer.parseInt(inputArr[1]);

        for (int i =0; i<len; i++) {
            int type = Integer.parseInt(br.readLine());
            switch (type) {
                case 1:
                    str = str.substring(1) + str.charAt(0);
                    break;
                case 2:
                    str = str.charAt(str.length()-1) + str.substring(0, str.length()-1);
                    break;
                case 3:
                    String temp = "";
                    for (int j=str.length()-1; j>=0; j--) {
                        temp += str.charAt(j);
                    }
                    str = temp;
                    break;
            }

            System.out.println(str);
        }



    }
}