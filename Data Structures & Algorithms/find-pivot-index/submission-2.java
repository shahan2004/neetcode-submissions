class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;
        int left = 0;
        int right = 0;
        int total = 0;

        // Find total sum
        for (int i = 0; i < n; i++) {
            total = total + nums[i];
        }

        // Check each index as a possible pivot
        for (int i = 0; i < n; i++) {

            right = total - nums[i] - left;

            if (left == right) {
                return i;
            }

            left = left + nums[i];
        }

        // No pivot was found
        return -1;
    }
}