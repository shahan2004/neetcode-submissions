class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        int count1=0;
        int count2=0;
        boolean status=true;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]<nums[j])
                {
                    count1++;
                   
                    break;
                }
                else if(nums[i]>nums[j])
                {
                    count2++;
                    break;
                }
                


            }
        }
        if(count1>0 &&count2>0)
        {
            status=false;
        }
       
        return status;
    }
}