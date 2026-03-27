package amazon.codingproblems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args){
        System.out.println(Arrays.toString(twoSum(new int[]{83, 97, 25}, 108)));
        System.out.println(Arrays.toString(twoSum(new int[]{99, 66, 9, 21, 5, 95, 75, 34, 62, 2}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{72, 31, 72, 87, 83, 70, 23, 17, 89}, 87)));
    }
    public static int[] twoSum(int[] numbers, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        for(int num : numbers){
            map.put(num, i);
            i++;
        }
        for(int num : numbers){
            if(map.containsKey(target-num)){
                return new int[]{map.get(num), map.get(target-num)};
            }
        }

        return null;
    }
}
