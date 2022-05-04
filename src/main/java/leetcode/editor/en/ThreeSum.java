package leetcode.editor.en;

//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[
//k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
//
// Notice that the solution set must not contain duplicate triplets. 
//
// 
// Example 1: 
// Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
// Example 2: 
// Input: nums = []
//Output: []
// Example 3: 
// Input: nums = [0]
//Output: []
// 
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 3000 
// -10⁵ <= nums[i] <= 10⁵ 
// 
// Related Topics Array Two Pointers Sorting 👍 17555 👎 1682

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        int[] s = new int[]{3,0,-2,-1,1,2};
        System.out.println(solution.threeSum(s));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            List<Integer> list;
            List<List<Integer>> result = new ArrayList<>();


            int n = nums.length;

            Arrays.sort(nums);

            for (int k = 0; k < n; k++) {
                int target = -nums[k];
                int i = k+1;
                int j = n - 1;
                while (i < j) {
                    if (target > nums[i] + nums[j]) {
                        j--;
                    } else if (target < nums[i] + nums[j]) {
                        i++;
                    } else if (target == nums[i] + nums[j]) {
                        list = new ArrayList<>();
                        list.add(nums[k]);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        i++;
                        j--;
                        if (!result.contains(list)) {
                            result.add(list);
                        }
                    }
                }
            }

            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
