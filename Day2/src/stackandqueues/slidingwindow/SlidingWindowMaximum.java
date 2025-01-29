package stackandqueues.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

class SlidingWindowMaximum {
    int[] slidingWindowMax(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove elements outside the window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove elements smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            deque.offer(i);

            // The largest element in the current window is at the front
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SlidingWindowMaximum swm = new SlidingWindowMaximum();
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int[] result = swm.slidingWindowMax(nums, 3);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
