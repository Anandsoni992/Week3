package hashmapandhasfunctions.twosum;

import java.util.HashMap;

class TwoSum {
    // Function to find two indices such that their values add up to the target
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {};  // Return empty array if no solution
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = ts.twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
