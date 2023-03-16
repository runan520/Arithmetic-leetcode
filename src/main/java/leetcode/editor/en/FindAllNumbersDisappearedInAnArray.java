package leetcode.editor.en;

//Given an array nums of n integers where nums[i] is in the range [1, n], 
//return an array of all the integers in the range [1, n] that do not appear in nums. 
//
// 
// Example 1: 
// Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
// Example 2: 
// Input: nums = [1,1]
//Output: [2]
// 
// 
// Constraints: 
//
// 
// n == nums.length 
// 1 <= n <= 10⁵ 
// 1 <= nums[i] <= n 
// 
//
// 
// Follow up: Could you do it without extra space and in O(n) runtime? You may 
//assume the returned list does not count as extra space. 
// Related Topics Array Hash Table 👍 6702 👎 391

import java.util.LinkedList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[]{10, 2, 5, 10, 9, 1, 1, 4, 3, 7};
        Solution solution = new FindAllNumbersDisappearedInAnArray().new Solution();
        System.out.println(solution.findDisappearedNumbers(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {

            for (int i = 0; i < nums.length; i++) {
                int index = Math.abs(nums[i]) - 1;

                if (nums[index] > 0) {
                    nums[index] *= -1;
                }
            }

            List<Integer> list = new LinkedList<Integer>();

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    list.add(i+1);
                }
            }

            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}