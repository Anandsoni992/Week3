package fibonacciseriescomparison;

public class FibonacciComparison {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void comparePerformance(int n) {
        long startTime, elapsedTime;

        // Recursive Fibonacci
        startTime = System.nanoTime();
        int fibRec = fibonacciRecursive(n);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Fibonacci(%d) Recursive: %d | Time: %,dns%n", n, fibRec, elapsedTime);

        // Iterative Fibonacci
        startTime = System.nanoTime();
        int fibIter = fibonacciIterative(n);
        elapsedTime = System.nanoTime() - startTime;
        System.out.printf("Fibonacci(%d) Iterative: %d | Time: %,dns%n", n, fibIter, elapsedTime);
    }

    public static void main(String[] args) {
        int[] testCases = {10, 30, 50}; // Change values if needed
        for (int n : testCases) {
            comparePerformance(n);
        }
    }
}
