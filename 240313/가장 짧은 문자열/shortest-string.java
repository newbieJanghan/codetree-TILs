import java.util.*;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();

        ArrayList<String> array = new ArrayList<>();
        array.add(first);
        array.add(second);
        array.add(third);

        array.sort(Comparator.comparing((String::length)));

        System.out.println(array.get(2).length() - array.get(0).length());
    }
}