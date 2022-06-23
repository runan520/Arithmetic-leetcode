package leetcode.editor.en;

//Given an integer array nums, move all 0's to the end of it while maintaining 
//the relative order of the non-zero elements. 
//
// Note that you must do this in-place without making a copy of the array. 
//
// 
// Example 1: 
// Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
// Example 2: 
// Input: nums = [0]
//Output: [0]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you minimize the total number of operations done? Related 
//Topics Array Two Pointers 👍 9510 👎 248

public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int n = nums.length;
            int flag = 0;
            int j = 0;
            //让数组不等与0的数都放在最前面
            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            //所有的书都在j的喜爱表前面
            for (int i = j; i < n; i++) {
                nums[i] = 0;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}