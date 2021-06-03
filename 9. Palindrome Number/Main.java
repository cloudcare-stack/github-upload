import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Solution answer = new Solution();
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        System.out.println(answer.isPalindrome(x));

    }
}
