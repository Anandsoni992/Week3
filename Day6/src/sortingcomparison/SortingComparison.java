package sortingcomparison;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }
        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void compareSortingPerformance(int size) {
        Random random = new Random();
        int[] data1 = new int[size];
        int[] data2 = new int[size];
        int[] data3 = new int[size];

        for (int i = 0; i < size; i++) {
            int num = random.nextInt(size * 10);
            data1[i] = data2[i] = data3[i] = num;
        }

        // Bubble Sort
        long startTime = System.nanoTime();
        bubbleSort(data1);
        long bubbleTime = System.nanoTime() - startTime;

        // Merge Sort
        startTime = System.nanoTime();
        mergeSort(data2, 0, size - 1);
        long mergeTime = System.nanoTime() - startTime;

        // Quick Sort
        startTime = System.nanoTime();
        quickSort(data3, 0, size - 1);
        long quickTime = System.nanoTime() - startTime;

        System.out.printf("Dataset Size: %,d | Bubble Sort: %,dns | Merge Sort: %,dns | Quick Sort: %,dns\n", size, bubbleTime, mergeTime, quickTime);
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        for (int size : datasetSizes) {
            compareSortingPerformance(size);
        }
    }
}
