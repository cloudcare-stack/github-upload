public class Solution {

    public boolean isPalindrome(int x) {

        int reverse = 0;
        int temp = x;
        //if(x < 0) return false;
        while(temp > 0){
            int pop = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + pop;
        }
        return reverse == x;
    }

}
