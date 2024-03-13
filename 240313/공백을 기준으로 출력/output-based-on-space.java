import java.util.*;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(first.replaceAll(" ", "") + second.replaceAll(" ", ""));
    }
}