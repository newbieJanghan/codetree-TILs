import java.util.Scanner;

public class Main {

    public static void main(String[] receipt) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] list = a.split("-");
        System.out.print(list[0] + "-" + list[2] + "-" + list[1]);
    }
}