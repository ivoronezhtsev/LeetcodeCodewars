/*
Входные данные: nums = [1,2,1]
 Выходные данные: [1,2,1,1,2,1]
 Пояснение: Массив ans формируется следующим образом:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */
public class ConcatinationArray {

    public static void main(String[] args) {
        int[] nums = new int[] {1,2,1};
        int[] result = getConcatenation(nums);
        for(int r: result) {
            System.out.print(r + " ");
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for(int i = 0; i < nums.length * 2; i++) {
            result[i] = nums[i % nums.length];
        }
        return result;
    }
}
