package leetcode.editor.cn;

//English description is not available for the problem. Please switch to Chinese
//. Related Topics 数组 二分查找 
// 👍 172 👎 0

public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof {
    public static void main(String[] args) {
        Solution solution = new ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
        System.out.println(solution.search(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int leftIdx = binarySearch(nums, target, true);
            int rightIdx = binarySearch(nums, target, false) - 1;

            if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
                return rightIdx - leftIdx + 1;
            }
            return 0;
        }

        private int binarySearch(int[] nums, int target, boolean lower) {
            int left = 0;
            int right = nums.length - 1;
            int ans = nums.length;

            while (left <= right) {
                int mid = (left + right) / 2;
                //左边的就是target刚好大于前一个数，右边的就是target刚好小于一个数
                if (nums[mid] > target || (lower && nums[mid] >= target)) {
                    right = mid - 1;
                    ans = mid;
                } else {
                    left = mid + 1;
                }
            }
            return ans;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}