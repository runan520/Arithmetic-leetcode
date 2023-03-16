package leetcode.editor.en;

/**
 * @ClassName FindNumbersEvenNumberDigits
 * @Description TODO
 * @Author XiaoShuMu
 * @Version 1.0
 * @Create 2022-06-07 14:10
 * @Blog https://www.cnblogs.com/WLCYSYS/
 **/
public class FindNumbersEvenNumberDigits {
    public static void main(String[] args) {
        FindNumbersEvenNumberDigits.Solution solution = new FindNumbersEvenNumberDigits().new Solution();
        int[] nums = new int[]{555, 901, 482, 1771};
        System.out.println(solution.findNumbers(nums));
    }

    class Solution {
        public int findNumbers(int[] nums) {


            int result = 0;

            for (int i = 0; i < nums.length; i++) {
                int current = nums[i] / 10;
                int count = 1;
                while (current > 0) {
                    current = current / 10;
                    count++;
                }

                if (count % 2 == 0) {
                    result++;
                }
            }

            return result;
        }
    }
}
