import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * @author LJY
 */
public class MyQueue {

    private Stack<Integer> in = new Stack<>();

    private Stack<Integer> out = new Stack<>();

    /** Initialize your data structure here. */
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        in.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        out.removeAllElements();
        for (int i = in.size() - 1; i >=0; i--) {
            out.push(in.get(i));
        }
        Integer pop = out.pop();
        in.removeAllElements();
        for (int i = out.size() - 1; i >=0; i--) {
            in.push(out.get(i));
        }
        return pop;
    }

    /** Get the front element. */
    public int peek() {
        out.removeAllElements();
        for (int i = in.size() - 1; i >=0; i--) {
            out.push(in.get(i));
        }
        Integer peek = out.peek();
        in.removeAllElements();
        for (int i = out.size() - 1; i >=0; i--) {
            in.push(out.get(i));
        }
        return peek;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return out.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

class Test{
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        queue.peek();  // 返回 1
        queue.pop();   // 返回 1
        queue.empty(); // 返回 false

    }
}