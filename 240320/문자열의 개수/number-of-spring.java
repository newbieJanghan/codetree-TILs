import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        List<String> array = new ArrayList<>();

        while (true) {
            String str = sc.next();
            if (Objects.equals(str, "0")) {
                break;
            }
            array.add(str);
        }

        System.out.println(array.size());
        for (int i=0; i<array.size(); i++) {
            if ((i+1)%2 !=1 ) {
                continue;
            }
            System.out.println(array.get(i));
        }


    }
}