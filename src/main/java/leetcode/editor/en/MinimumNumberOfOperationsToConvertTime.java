package leetcode.editor.en;

//You are given two strings current and correct representing two 24-hour times. 
//
//
// 24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and
//MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:
//59.
//
// In one operation you can increase the time current by 1, 5, 15, or 60
//minutes. You can perform this operation any number of times.
//
// Return the minimum number of operations needed to convert current to correct.
//
//
//
// Example 1:
//
//
//Input: current = "02:30", correct = "04:35"
//Output: 3
//Explanation:
//We can convert current to correct in 3 operations as follows:
//- Add 60 minutes to current. current becomes "03:30".
//- Add 60 minutes to current. current becomes "04:30".
//- Add 5 minutes to current. current becomes "04:35".
//It can be proven that it is not possible to convert current to correct in
//fewer than 3 operations.
//
// Example 2:
//
//
//Input: current = "11:00", correct = "11:01"
//Output: 1
//Explanation: We only have to add one minute to current, so the minimum number
//of operations needed is 1.
//
//
//
// Constraints:
//
//
// current and correct are in the format "HH:MM"
// current <= correct
//
// 👍 82 👎 15

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class MinimumNumberOfOperationsToConvertTime {
    public static void main(String[] args) throws ParseException {
        Solution solution = new MinimumNumberOfOperationsToConvertTime().new Solution();
        System.out.println(solution.convertTime("02:30", "01:35"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int convertTime(String current, String correct) {
            //增加 先通过：分开
            String currentHH = current.split(":")[0];
            String currentMM = current.split(":")[1];

            String correctHH = correct.split(":")[0];
            String correctMM = correct.split(":")[1];

            Date currentDate = null;
            Date correctDate = null;
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
            Long diff = null;

            Long diffHour = null;
            Long diffMinute = null;
            //然后根据current的小时减去correct，算出是正的还是负的
            if (((currentHH.compareTo(correctHH) <= 0) && (currentMM.compareTo(correctMM) <=0)) || (currentHH.compareTo(correctHH) <= 0 && currentMM.compareTo(correctMM) >0)) {
                String currentDD = current;
                String correctDD = correct;
                try {
                    correctDate = formatter.parse(correctDD);
                    currentDate = formatter.parse(currentDD);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                diff = correctDate.getTime() - currentDate.getTime();

                diffHour = diff / (60 * 60 * 1000);
                diffMinute = diff / (60 * 1000);
            } else {
                String currentDD = current;
                String correctDD = correct;
                try {
                    correctDate = formatter.parse(correctDD);
                    currentDate = formatter.parse(currentDD);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                diff = correctDate.getTime() - currentDate.getTime();
                diff = 24*60*60*1000 + diff;
                diffHour = diff / (60 * 60 * 1000);
                diffMinute = diff / (60 * 1000);

            }
            int result = 0;
            //然后根据相差的分钟来判定几次
            diffMinute %= 60;
            if (diffMinute >= 15) {
                result += diffMinute / 15;
                diffMinute = diffMinute % 15;
            }
            if (diffMinute >= 5) {
                result += diffMinute / 5;
                diffMinute = diffMinute % 5;
            }
            if (diffMinute < 5) {
                result += diffMinute;
            }

            result = (int) (result + diffHour);
            return result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
