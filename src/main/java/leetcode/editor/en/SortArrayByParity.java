package leetcode.editor.en;

//Given an integer array nums, move all the even integers at the beginning of 
//the array followed by all the odd integers. 
//
// Return any array that satisfies this condition. 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be 
//accepted.
// 
//
// Example 2: 
//
// 
//Input: nums = [0]
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 5000 
// 0 <= nums[i] <= 5000 
// 
// Related Topics Array Two Pointers Sorting 👍 3582 👎 123

public class SortArrayByParity {
    public static void main(String[] args) {
        Solution solution = new SortArrayByParity().new Solution();
        int[] arr = new int[]{17, 18, 5, 4, 6, 1};
        System.out.println(solution.sortArrayByParity(arr));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int n = nums.length;
            int j = 0;
            int rigth = n - 1;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {

                if (nums[i] % 2 == 0) {
                    arr[j] = nums[i];
                    j++;
                } else {
                    arr[rigth] = nums[i];
                    rigth--;
                }
            }
            return arr;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}