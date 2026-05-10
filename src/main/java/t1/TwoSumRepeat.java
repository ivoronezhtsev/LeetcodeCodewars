package t1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumRepeat {
    static void main() {
        int[] test = new int[]{2, 7, 8, 8};
        System.out.println(Arrays.toString(solution(test, 9)));
    }

    public static int[] solution(int[] input, int target) {
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
