import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int input = (int) sc.next().charAt(0);

        if (input == 97) {
            System.out.print("z");
        } 
        else {
            System.out.print((char) (input-1));
        }
    }
}