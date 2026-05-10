package easy_array;

/**
 * <p>Дан целочисленный массив nums, отсортированный в порядке неубывания.
 * Необходимо удалить дубликаты in-place таким образом, чтобы каждый уникальный элемент встречался только один раз.
 * Относительный порядок элементов должен оставаться неизменным.<br>
 * <strong>In-place</strong> - алгоритм не создает доп структуру, а изменяет входные данные на месте.
 *</p>
 * <p>
 * <strong>Example:</strong><br>
 * Input: nums = [1,1,2] <br>
 * Output: 2, nums = [1,2,_] <br>
 * Важно: Функция должна вернуть k = 2, с первыми двумя элементами 1 и 2. Что останется в массиве после k элементов
 * не важно
 *
 * </p>
 */
class RemoveDuplicates {

    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 2};
        int k = removeDuplicates(input);
        System.out.println("Весь массив");
        for (int n : input) {
            System.out.println(n);
        }
        System.out.println("Массив из к:");
        for (int i = 0; i < k; i++) {
            System.out.println(input[i]);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int lastUniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[lastUniqueIndex]) { // 2 != 1 Нашли новый уникальный элемент
                lastUniqueIndex++;
                nums[lastUniqueIndex] = nums[i];
            }
        }
        return lastUniqueIndex + 1;
    }
}