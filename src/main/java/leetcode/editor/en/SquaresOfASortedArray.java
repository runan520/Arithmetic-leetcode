package leetcode.editor.en;

//Given an integer array nums sorted in non-decreasing order, return an array 
//of the squares of each number sorted in non-decreasing order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
// 
//
// Example 2: 
//
// 
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums is sorted in non-decreasing order. 
// 
//
// 
//Follow up: Squaring each element and sorting the new array is very trivial, 
//could you find an O(n) solution using a different approach? Related Topics Array 
//Two Pointers Sorting 👍 5454 👎 157

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        Solution solution = new SquaresOfASortedArray().new Solution();
        int[] nums = new int[]{-7, -3, 2, 3, 11};
        System.out.println(solution.sortedSquares(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortedSquares(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (int) Math.pow(nums[i], 2);
            }
            Arrays.sort(nums);

            return nums;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}