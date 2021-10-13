package leetcode.editor.cn;

//Given an integer n, return a string array answer (1-indexed) where: 
//
// 
// answer[i] == "FizzBuzz" if i is divisible by 3 and 5. 
// answer[i] == "Fizz" if i is divisible by 3. 
// answer[i] == "Buzz" if i is divisible by 5. 
// answer[i] == i if non of the above conditions are true. 
// 
//
// 
// Example 1: 
// Input: n = 3
//Output: ["1","2","Fizz"]
// Example 2: 
// Input: n = 5
//Output: ["1","2","Fizz","4","Buzz"]
// Example 3: 
// Input: n = 15
//Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","1
//3","14","FizzBuzz"]
// 
// 
// Constraints: 
//
// 
// 1 <= n <= 10⁴ 
// 
// Related Topics 数学 字符串 模拟 👍 139 👎 0

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        Solution solution = new FizzBuzz().new Solution();
        System.out.println(solution.fizzBuzz(3));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<String> fizzBuzz(int n) {
            String FIZZBUZZ = "FizzBuzz";
            String FIZZ = "Fizz";
            String BUZZ = "Buzz";
            List<String> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                String a = i + "";
                list.add(a);
                // answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
                if (i % 3 == 0 && i % 5 == 0) {
                    list.remove(i-1);
                    list.add(FIZZBUZZ);
                    // answer[i] == "Fizz" if i is divisible by 3.
                } else if (i % 3 == 0) {
                    list.remove(i-1);
                    list.add(FIZZ);
                    // answer[i] == "Buzz" if i is divisible by 5.
                } else if (i % 5 == 0) {
                    list.remove(i-1);
                    list.add(BUZZ);
                }
                // answer[i] == i if non of the above conditions are true.
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}