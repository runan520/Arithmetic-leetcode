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
            //先进行排序
            Arrays.sort(nums);
            List<List<Integer>> ans = new ArrayList<>();
            //然后确定第一个数，每次的第一个数不能重复
            for (int first = 0; first < nums.length; first++) {
                //确定第二个，第二个不可以是与前一个相等
                if (first > 0 && nums[first] == nums[first - 1]) {
                    continue;
                }
                //开始第二次循环，第一次的first可以根据数学知识，转换成-first
                //确定右指针
                int third = nums.length - 1;
                int target = -nums[first];
                //枚举
                for (int second = first + 1; second < nums.length; second++) {
                    //需要和上一次枚举的数不相同
                    if (second > first + 1 && nums[second] == nums[second - 1]) {
                        continue;
                    }

                    //确定第三个，左指针不可以超过右指针
                    while (second < third && nums[second] + nums[third] > target) {
                        --third;
                    }
                    //如果指针重合，随着b后续的增加
                    //就不会有满足a+b+c = 0 并且 b < c 的c了，可以退出循环
                    if (second == third) {
                        break;
                    }

                    if (nums[second] + nums[third] == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[first]);
                        list.add(nums[second]);
                        list.add(nums[third]);
                        ans.add(list);
                    }
                }
            }
            return ans;
        }

    }
//leetcode submit region end(Prohibit modification and deletion)

}