package binarysearch;

public class SearchInSortedMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols, col = mid % cols;
            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false; // Element not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5},
                {7, 9, 11},
                {13, 15, 17}
        };
        int target = 9;
        System.out.println("Element found: " + searchMatrix(matrix, target));
    }
}
