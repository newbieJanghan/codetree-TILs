import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        int first = sc.next().length();
        int second = sc.next().length();
        int third = sc.next().length();

        int[] array = new int[3];
        array[0] = first;
        array[1] = second;
        array[2] = third;

        OptionalInt min = Arrays.stream(array).min();


        System.out.print(min.getAsInt());
    }
}