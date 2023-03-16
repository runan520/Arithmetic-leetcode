package leetcode.editor.en;

//Given a binary array nums, return the maximum number of consecutive 1's in 
//the array if you can flip at most one 0. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,0,1,1,0]
//Output: 4
//Explanation: Flip the first zero will get the maximum number of consecutive 1
//s. After flipping, the maximum number of consecutive 1s is 4.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,0,1,1,0,1]
//Output: 4
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// nums[i] is either 0 or 1. 
// 
//
// 
// Follow up: What if the input numbers come in one by one as an infinite 
//stream? In other words, you can't store all numbers coming from the stream as it's 
//too large to hold in memory. Could you solve it efficiently? 
// Related Topics Array Dynamic Programming Sliding Window 👍 1115 👎 23

public class MaxConsecutiveOnesIi {
    public static void main(String[] args) {
        Solution solution = new MaxConsecutiveOnesIi().new Solution();
        int[] nums = new int[]{1, 0, 1, 1, 1, 0, 1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int longSquare = 0;
            int numZeros = 0;
            int right = 0;
            int left = 0;
            int n = nums.length;

            while (right < n) {

                if (nums[right] == 0) {
                    numZeros++;
                }

                while (numZeros == 2) {
                    if (nums[left] == 0) {
                        numZeros--;
                    }
                    left++;
                }

                longSquare = Math.max(longSquare, right - left + 1);
                right++;
            }

            return longSquare;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}