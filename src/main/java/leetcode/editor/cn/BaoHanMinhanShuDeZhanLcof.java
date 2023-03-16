//package leetcode.editor.cn;
//
////English description is not available for the problem. Please switch to Chinese
////. Related Topics 栈 设计
//// 👍 168 👎 0
//
//import edu.princeton.cs.algs4.In;
//
//import java.util.Deque;
//import java.util.LinkedList;
//import java.util.Stack;
//
//public class BaoHanMinhanShuDeZhanLcof {
//    public static void main(String[] args) {
//        MinStack solution = new BaoHanMinhanShuDeZhanLcof().new MinStack();
//
//    }
//
//    //leetcode submit region begin(Prohibit modification and deletion)
//    class MinStack {
//
//        Deque<Integer> stackA;
//        Deque<Integer> stackB;
//        /**
//         * initialize your data structure here.
//         */
//        public MinStack() {
//            stackA = new LinkedList<>();
//            stackB = new LinkedList<>();
//        }
//
//        public void push(int x) {
//            stack.push(x);
//        }
//
//        public void pop() {
//            if (!stack.isEmpty()) {
//                stack.pop();
//            }
//        }
//
//        public int top() {
//            if (!stack.isEmpty()) {
//                return stack.pop();
//            }
//            return -1;
//        }
//
//        public int min() {
//            if (!stack.isEmpty()) {
//                return stack.pop();
//            }
//            return 1;
//        }
//    }
//
///**
// * Your MinStack object will be instantiated and called as such:
// * MinStack obj = new MinStack();
// * obj.push(x);
// * obj.pop();
// * int param_3 = obj.top();
// * int param_4 = obj.min();
// */
////leetcode submit region end(Prohibit modification and deletion)
//
//}