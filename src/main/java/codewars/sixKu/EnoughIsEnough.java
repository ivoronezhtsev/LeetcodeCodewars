/*
package codewars.sixKu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int n : elements) {
            int count = countMap.getOrDefault(n, 0);
            if (count < maxOccurrences) {
                result.add(n);
                countMap.put(n, count + 1);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }

    static void main() throws Exception {
        assertArrayEquals(
                new int[]{20, 37, 21},
                EnoughIsEnough.deleteNth(new int[]{20, 37, 20, 21}, 1)
        );
        assertArrayEquals(
                new int[]{1, 1, 3, 3, 7, 2, 2, 2},
                EnoughIsEnough.deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2}, 3)

        );
        assertArrayEquals(
                new int[]{1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5},
                EnoughIsEnough.deleteNth(new int[]{1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1}, 3)
        );
        assertArrayEquals(
                new int[]{1, 1, 1, 1, 1},
                EnoughIsEnough.deleteNth(new int[]{1, 1, 1, 1, 1}, 5)
        );
        assertArrayEquals(
                new int[]{},
                EnoughIsEnough.deleteNth(new int[]{}, 5)
        );
    }
}
*/
