package stackandqueues.sortingstack;

import java.util.Stack;

class SortStack {
    Stack<Integer> stack = new Stack<>();

    // Insert element at correct position in sorted stack
    void sortedInsert(int x) {
        if (stack.isEmpty() || x > stack.peek()) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();
        sortedInsert(x);
        stack.push(temp);
    }

    // Sort stack using recursion
    void sort() {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sort();
            sortedInsert(temp);
        }
    }

    public static void main(String[] args) {
        SortStack ss = new SortStack();
        ss.stack.push(30);
        ss.stack.push(-5);
        ss.stack.push(18);
        ss.stack.push(14);
        ss.stack.push(-3);

        ss.sort();

        while (!ss.stack.isEmpty()) {
            System.out.println(ss.stack.pop());
        }
    }
}
