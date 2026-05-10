package t1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static void main() {
        int[] input = new int[]{2, 7, 11, 15};
        System.out.println(Arrays.toString(target(input, 9)));
    }

    //[2,7,11,15], target = 9
    //map[2, 0] map[7;1] map[11,2] map[15,3]
    //output: [2,7]
    public static int[] target(int input[], int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int complement = target - input[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(input[i], i);
        }
        return new int[]{-1, -1};
    }
}
