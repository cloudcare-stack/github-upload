import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        int[] num = {2,7,11,15};
        int target = 9;

        Solution sol = new Solution();

        int[] result = sol.twoSum(num, target);


        System.out.println(Arrays.toString(result));

    }
}
