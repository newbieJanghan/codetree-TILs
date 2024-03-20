import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char [] arr = sc.next().toCharArray();

        for (int i=0; i< arr.length; i++) {
            if (Character.isLowerCase(arr[i])) {
                System.out.print(Character.toUpperCase(arr[i]));
            }
            else {
                System.out.print(Character.toLowerCase(arr[i]));
            }
        }
    }
}