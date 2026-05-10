package easy_array;/*
package easy_array;


import java.util.ArrayList;
import java.util.List;

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Input: nums1 = [1,2,2,1], nums2 = [2,2]
[] [9,4,9,8,4]
Output: [4,9] //but 4, 9, 4, 9
 *//*

public class Intersection {


    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        int[] result = intersect(nums1, nums2);
        for (int n : result) {
            System.out.print(n + " ");
        }
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();

        if (nums1.length >= nums2.length) {
            for (int n : nums1) {
                int nc1 = isContains(nums1, n);
                int nc2 = isContains(nums2, n);
                */
/*if (isContains(nums2, n)) {
                    result.add(n);
                }*//*

            }
        } else {
            for (int n : nums2) {
                if (isContains(nums1, n)) {
                    result.add(n);
                }
            }
        }
        int[] resultInt = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultInt[i] = result.get(i);
        }
        return resultInt;
    }

    private static int isContains(int[] array, int elem) {
        int count = 0;
        for(int a: array) {
            if(elem == a) {
                count++;
            }
        }
        return count;
    }
}
*/
class Intersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums2.length > nums1.length) {
            return intersect(nums2, nums1);
        }
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int n: nums1) {
            countMap.put(n, count(nums1, n));
        }
        for(int n2: nums2) {
            if(countMap.getOrDefault(n2, 0) > 0) {
                countMap.put(n2, countMap.getOrDefault(n2, 0) - 1);
                result.add(n2);
            }
        }
        int[] output = new int[result.size()];
        for(int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        return output;
    }

    private static int count(int[] nums, int n) {
        int count = 0;
        for(int i: nums) {
            if(i == n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] result = intersect(new int[] {9,4,9,8,4}, new int[]{4,9,5});
        for(int r: result) {
            System.out.print(r + " ");
        }
    }
}