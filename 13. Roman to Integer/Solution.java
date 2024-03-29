import java.util.HashMap;

public class Solution {

    public int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for(int i = 0; i < s.length(); i++){
            if(i > 0 && (map.get(s.charAt(i)) > map.get(s.charAt(i-1)))){
                result = result + (map.get(s.charAt(i))-map.get(s.charAt(i - 1)))-map.get(s.charAt(i - 1));
            }
            else{
                result += map.get(s.charAt(i));
            }
        }
        return result;

//        int result = 0;
//
//        HashMap<String, Integer> map = new HashMap<>();
//        map.put("I", 1);
//        map.put("V", 5);
//        map.put("X", 10);
//        map.put("L", 50);
//        map.put("C", 100);
//        map.put("D", 500);
//        map.put("M", 1000);
//
//        String[] arr = s.split("");
//
//        for(int i = 0; i < s.length(); i++){
//            if(map.containsKey(arr[i])){
//                result += map.get(arr[i]);
//            }
//        }
//        return result;
    }

}
