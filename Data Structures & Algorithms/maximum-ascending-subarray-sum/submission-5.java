class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int max=0;
        int count=nums[0];
        max=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
            count=count+nums[i];
            
            }
            else
            {
                count=0;
                count=count+nums[i];

            }
            if(count>=max)
        {
            max=count;
        }
        
            
        }
       
        return max;
    }
}