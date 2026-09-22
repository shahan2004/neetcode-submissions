class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int currentmax=nums[0];
        int maxsum=nums[0];
        int total=0;
        int minsum=nums[0];
        int currentmin=nums[0];














        for(int i=0;i<n;i++)
        {
            total=total+nums[i];
        }
    
        for(int i=1;i<n;i++)
        {
            currentmax=Math.max(nums[i],currentmax+nums[i]);
            maxsum=Math.max(currentmax,maxsum);
            currentmin=Math.min(nums[i],currentmin+nums[i]);
            minsum=Math.min(currentmin,minsum);
            
        }
        if(maxsum<0)
        {
            return maxsum;
        }
        return Math.max(maxsum,total-minsum);
    }
}