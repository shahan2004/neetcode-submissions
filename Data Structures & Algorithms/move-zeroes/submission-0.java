class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        for(int k=0;k<n;k++)
        {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==0)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    break;
                }
                else
                {
                    break;
                }
            }
        }
        }
        
       
        

    }
}