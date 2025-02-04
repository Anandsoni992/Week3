package binarysearch;

public class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid];
                } else if (arr[mid] < arr[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            } else if (mid == 0) {
                return arr[0] > arr[1] ? arr[0] : arr[1];
            } else if (mid == arr.length - 1) {
                return arr[arr.length - 1] > arr[arr.length - 2] ? arr[arr.length - 1] : arr[arr.length - 2];
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int peak = findPeakElement(arr);
        System.out.println("Peak element of the array is: " + peak);
    }
}
