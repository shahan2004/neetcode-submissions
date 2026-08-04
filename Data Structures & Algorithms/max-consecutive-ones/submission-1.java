class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int max=0;
    int current=0;
    int n=nums.length;
    for(int i=0;i<n;i++)
    {
        if(nums[i]==1)
        {
            current++;
            if(current>max)
            {
                max=current;
            }
        }
        else if(nums[i]==0)
        {
            current=0;
        }
    }   
    return max; 
    }
}