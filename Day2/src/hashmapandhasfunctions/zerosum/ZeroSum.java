package hashmapandhasfunctions.zerosum;

import java.util.HashMap;

class ZeroSum{
    // Function to find all subarrays whose sum is zero
    public void findZeroSumSubarrays(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum is 0, print the subarray from index 0 to i
            if (sum == 0) {
                System.out.println("Subarray: [0, " + i + "]");
            }

            // If sum is already in the map, it means there's a zero sum subarray
            if (map.containsKey(sum)) {
                System.out.println("Subarray: [" + (map.get(sum) + 1) + ", " + i + "]");
            }

            map.put(sum, i);
        }
    }

    public static void main(String[] args) {
        ZeroSum zsa = new ZeroSum();
        int[] arr = {6, -1, 3, -2, -3, 1, 2, -3};
        zsa.findZeroSumSubarrays(arr);
    }
}
