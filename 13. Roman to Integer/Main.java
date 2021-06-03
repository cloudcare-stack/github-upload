import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Solution answer = new Solution();
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();

        System.out.println(answer.romanToInt(x));

    }
}
