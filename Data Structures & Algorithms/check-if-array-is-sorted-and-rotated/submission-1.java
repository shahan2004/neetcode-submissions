class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int failure=0;
        boolean status=true;
        if(nums[n-1]>nums[0])
        {
            failure=1;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]>nums[j])
                {
                    failure++;
                    break;
                }
              
                else if(nums[i]<=nums[j]){
                    break;
                }
                
                
            }
        }
        if(failure<2)
        {
            return status;
        }
        else
        {
            status=false;
            return status;
        }
    }
}