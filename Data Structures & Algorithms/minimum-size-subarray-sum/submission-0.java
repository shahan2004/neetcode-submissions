class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        int sum=0;
        int mincnt=n+1;
        while(right<n)
        {
            
            
             sum=sum+nums[right];
            
            if(sum>=target)
            {
              
                while(sum>=target)
                {
               mincnt = Math.min(mincnt, right - left + 1);
                    sum = sum - nums[left];
                    left++;
                    
                }
                }
                right++;
            }
     if(mincnt==n+1)
     {
        return 0;
     }
        
        
        return mincnt;
       
    }
}