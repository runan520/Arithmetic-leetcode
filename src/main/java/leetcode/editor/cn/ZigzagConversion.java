package leetcode.editor.cn;

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number o
//f rows like this: (you may want to display this pattern in a fixed font for bett
//er legibility) 
//
// 
//P   A   H   N
//A P L S I I G
//Y   I   R
// 
//
// And then read line by line: "PAHNAPLSIIGYIR" 
//
// Write the code that will take a string and make this conversion given a numbe
//r of rows: 
//
// 
//string convert(string s, int numRows);
// 
//
// 
// Example 1: 
//
// 
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
// 
//
// Example 2: 
//
// 
//Input: s = "PAYPALISHIRING", numRows = 4
//Output: "PINALSIGYAHRPI"
//Explanation:
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
// 
//
// Example 3: 
//
// 
//Input: s = "A", numRows = 1
//Output: "A"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// s consists of English letters (lower-case and upper-case), ',' and '.'. 
// 1 <= numRows <= 1000 
// 
// Related Topics 字符串 
// 👍 1220 👎 0

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
        Solution solution = new ZigzagConversion().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String convert(String s, int numRows) {
            if (numRows <= 1) {
                return s;
            }

            List<StringBuilder> rows = new ArrayList<>();
            //Math.min(numRows, s.length()，看这个字符串的长度有没有超过给定的行数，如果没有超过给定的长度，
            // 直接按字符串的长度给stringbuilder，多少行就添加多少个StringBuilder
            for (int i = 0; i < Math.min(numRows, s.length()); i++) {
                rows.add(new StringBuilder());
            }

            int currRow = 0;
            boolean goingDown = false;

            //直接添加到对应的list
            for (char c : s.toCharArray()) {
                rows.get(currRow).append(c);
                //等到行首或者行末直接
                if (currRow == 0 || currRow == numRows - 1) goingDown = !goingDown;
                //行数直接增加或减少
                currRow += goingDown ? 1 : -1;
            }

            //这时候直接把字符串添加到list
            StringBuilder ret = new StringBuilder();
            for (StringBuilder row : rows) {
                ret.append(row);
            }

            return ret.toString();

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}