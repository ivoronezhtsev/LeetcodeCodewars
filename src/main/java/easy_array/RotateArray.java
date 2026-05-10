package easy_array;

/*
Входные данные: nums = [1,2,3,4,5,6,7], k = 3
 Выходные данные: [5,6,7,1,2,3,4]
 Пояснение:
Повернуть на 1 шаг вправо: [7,1,2,3,4,5,6]
Повернуть на 2 шага вправо: [6,7,1,2,3,4,5]
Повернуть на 3 шага вправо: [5,6,7,1,2,3,4]
входной
 */
public class RotateArray {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 0};
        int k = 2;
        //moveToRight(k, nums);
        rotate(k, nums);
        print(nums);
        System.out.println();
    }


    private static void rotate(int k, int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        for(int i = 0; i < nums.length; i++) {
            result[(i + k) % n] = nums[i];
        }
        for(int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }
    }

    /**
     * Медленная версия. Сдвигаем массив на к-элементов вправо в цикле.
     * Не требует доп памяти, только одну переменную last
     */
    private static void moveToRight(int k, int[] nums) {
        for (int i = 0; i < k; i++) {
            int last = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }

    private static void print(int[] nums) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}

