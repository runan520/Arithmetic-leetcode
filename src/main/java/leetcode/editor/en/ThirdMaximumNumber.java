package leetcode.editor.en;

//Given an integer array nums, return the third distinct maximum number in this 
//array. If the third maximum does not exist, return the maximum number. 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,2,1]
//Output: 1
//Explanation:
//The first distinct maximum is 3.
//The second distinct maximum is 2.
//The third distinct maximum is 1.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2]
//Output: 2
//Explanation:
//The first distinct maximum is 2.
//The second distinct maximum is 1.
//The third distinct maximum does not exist, so the maximum (2) is returned 
//instead.
// 
//
// Example 3: 
//
// 
//Input: nums = [2,2,3,1]
//Output: 1
//Explanation:
//The first distinct maximum is 3.
//The second distinct maximum is 2 (both 2's are counted together since they 
//have the same value).
//The third distinct maximum is 1.
// 
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
//Follow up: Can you find an O(n) solution? Related Topics Array Sorting 👍 1732
// 👎 2340

import java.util.*;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Solution solution = new ThirdMaximumNumber().new Solution();
        int[] nums = new int[]{1, 2,3};
        System.out.println(solution.thirdMax(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int thirdMax(int[] nums) {

            int length = nums.length;

            List<Integer> thirdNumsList = new ArrayList<Integer>();
            Set<Integer> thirdNumsSet = new HashSet<Integer>(3);

            for (int i = 0; i < length; i++) {
                thirdNumsSet.add(nums[i]);
            }

            int containNums = 3;
            for (Integer n : thirdNumsSet) {
                thirdNumsList.add(n);
                containNums--;

                if (containNums == 0) {
                    break;
                }
            }

            if (thirdNumsList.size() < 3) {
                Collections.sort(thirdNumsList);
                return thirdNumsList.get(thirdNumsList.size() - 1);
            }

            for (int num : thirdNumsSet) {
                Collections.sort(thirdNumsList);

                if (num > thirdNumsList.get(0) && !thirdNumsList.contains(num)) {
                    thirdNumsList.set(0, num);
                }
            }

            Collections.sort(thirdNumsList);
            return thirdNumsList.get(0);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}