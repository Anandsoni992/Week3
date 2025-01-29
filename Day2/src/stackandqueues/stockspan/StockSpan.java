package stackandqueues.stockspan;

import java.util.Stack;

class StockSpan {
    // Calculate stock span using a stack
    int[] calculateSpan(int[] prices) {
        int[] span = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            span[i] = (stack.isEmpty()) ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        StockSpan ss = new StockSpan();
        int[] prices = { 100, 80, 60, 70, 60, 75, 85 };
        int[] span = ss.calculateSpan(prices);

        for (int i = 0; i < span.length; i++) {
            System.out.println("Price: " + prices[i] + ", Span: " + span[i]);
        }
    }
}
