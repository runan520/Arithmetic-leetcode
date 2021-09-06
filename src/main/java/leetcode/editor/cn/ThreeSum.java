package leetcode.editor.cn;

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
// Related Topics 数组 双指针 排序 👍 3704 👎 0

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        int[] a = new int[]{};
        System.out.println(solution.threeSum(a));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            int n = nums.length;
            List<List<Integer>> list = new ArrayList<>();
            //为空
            if (nums.length == 0) {
                return list;
            }
            //首先是找到第一个
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                //c 对应的是数组的最右边
                int k = n - 1;
                int target = -nums[i];
                for (int j = i + 1; j < n; j++) {
                    //保证第二个大于第一个
                    if (j > i + 1 && nums[j] == nums[j - 1]) {
                        continue;
                    }
                    //保证b的指针在c的指针的左侧,这样也保证了第三个数大于前两个
                    while (j < k && nums[j] + nums[k] > target){
                        --k;
                    }

                    //如果两个指针重合，就不会满足a+b+c = 0,并且b < c
                    if (j == k){
                        break;
                    }

                    if (nums[j] + nums[k] == target){
                        List<Integer> integerList = new ArrayList<>();
                        integerList.add(nums[i]);
                        integerList.add(nums[j]);
                        integerList.add(nums[k]);
                        list.add(integerList);
                    }
                }
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}