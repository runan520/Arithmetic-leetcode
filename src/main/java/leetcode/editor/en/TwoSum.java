package leetcode.editor.en;

//Given an array of integers nums and an integer target, return indices of the 
//two numbers such that they add up to target. 
//
// You may assume that each input would have exactly one solution, and you may 
//not use the same element twice. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
// 
//
// Example 3: 
//
// 
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// Only one valid answer exists. 
// 
//
// 
//Follow-up: Can you come up with an algorithm that is less than O(n²) time 
//complexity? Related Topics Array Hash Table 👍 27487 👎 878

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        Solution solution = new TwoSum().new Solution();
        int[] s = new int[]{3, 2, 6, 3};
        int target = 6;
        solution.twoSum(s, target);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            int n = nums.length;

            HashMap<Integer, Integer> hashMap = new HashMap<>();

            for (int i = 0; i < n; i++) {

                int key = target - nums[i];
                //判断map里是否含有target - nums[i]值
                if (hashMap.containsKey(key)){
                    int k = hashMap.get(key);
                    return new int[]{k, i};
                }

                hashMap.put(nums[i], i);
            }
            return null;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}