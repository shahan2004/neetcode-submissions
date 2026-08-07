

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        int m = n / 2;
        int k = 0;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            }
            else {
                freq.put(nums[i], 1);
            }

            if (freq.get(nums[i]) > m) {
                k = nums[i];
            }
        }

        return k;
    }
}