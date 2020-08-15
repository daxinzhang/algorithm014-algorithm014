//设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈
public class MinStack {

    /**
     * initialize your data structure here.
     */
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MinStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void push(int x) {
        if (stack2.isEmpty() || x < stack2.peek()) {
            stack2.push(x);
        } else {
            stack2.push(stack2.peek());
        }
        stack1.push(x);
    }

    public void pop() {
        if (!stack2.isEmpty()) {
            stack2.pop();
            stack1.pop();
        }
    }

    public int top() {
        if (!stack1.isEmpty()) {
            return stack1.peek();
        }

        throw new RuntimeException("");
    }

    public int getMin() {
        if (!stack2.isEmpty()) {
            return stack2.peek();
        }

        throw new RuntimeException("");
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

