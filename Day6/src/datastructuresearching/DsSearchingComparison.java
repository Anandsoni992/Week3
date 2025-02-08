package datastructuresearching;

import java.util.*;

public class DsSearchingComparison {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void compareSearchPerformance(int size) {
        Random random = new Random();
        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Fill data structures
        for (int i = 0; i < size; i++) {
            int num = random.nextInt(size * 10);
            array[i] = num;
            hashSet.add(num);
            treeSet.add(num);
        }

        int target = array[size / 2]; // Pick a middle element as target

        // Measure Array Search (O(N))
        long startTime = System.nanoTime();
        linearSearch(array, target);
        long arrayTime = System.nanoTime() - startTime;

        // Measure HashSet Search (O(1))
        startTime = System.nanoTime();
        hashSet.contains(target);
        long hashSetTime = System.nanoTime() - startTime;

        // Measure TreeSet Search (O(log N))
        startTime = System.nanoTime();
        treeSet.contains(target);
        long treeSetTime = System.nanoTime() - startTime;

        System.out.printf("Dataset Size: %,d | Array Search: %,dns | HashSet Search: %,dns | TreeSet Search: %,dns\n",
                size, arrayTime, hashSetTime, treeSetTime);
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1_000, 100_000, 1_000_000};
        for (int size : datasetSizes) {
            compareSearchPerformance(size);
        }
    }
}
