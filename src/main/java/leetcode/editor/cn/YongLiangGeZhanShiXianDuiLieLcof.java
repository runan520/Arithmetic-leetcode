package leetcode.editor.cn;

//English description is not available for the problem. Please switch to Chinese
//. Related Topics 栈 设计 队列 
// 👍 286 👎 0

import java.util.Deque;
import java.util.LinkedList;

public class YongLiangGeZhanShiXianDuiLieLcof{
  public static void main(String[] args) {
      CQueue solution = new YongLiangGeZhanShiXianDuiLieLcof().new CQueue();

  }
//leetcode submit region begin(Prohibit modification and deletion)
class CQueue {
      Deque<Integer> stack_one;
      Deque<Integer> stack_two;

    public CQueue() {
        stack_one = new LinkedList<>();
        stack_two = new LinkedList<>();
    }
    //只用来储存
    public void appendTail(int value) {
        stack_one.push(value);
    }
    
    public int deleteHead() {
        //如果第二个栈为空
        if (stack_two.isEmpty()) {
            while (!stack_one.isEmpty()) {
                stack_two.push(stack_one.pop());
            }
        }

        if (stack_two.isEmpty()) {
            return -1;
        } else {
            int deleteItem = stack_two.pop();
            return deleteItem;
        }
    }

}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
//leetcode submit region end(Prohibit modification and deletion)

}