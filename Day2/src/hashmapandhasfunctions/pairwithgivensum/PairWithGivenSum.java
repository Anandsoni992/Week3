package hashmapandhasfunctions.pairwithgivensum;

import java.util.HashSet;

class PairWithGivenSum {
    // Function to find if a pair with the given sum exists
    public boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        PairWithGivenSum ps = new PairWithGivenSum();
        int[] arr = {3, 8, 12, 5, 7, 2};
        int target = 10;
        System.out.println(ps.hasPairWithSum(arr, target));  // true
    }
}
