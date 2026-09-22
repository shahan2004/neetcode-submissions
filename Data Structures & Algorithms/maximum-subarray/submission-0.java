class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currentsum=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++)
        {
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            max=Math.max(currentsum,max);

        }

        return max;
    }
}
