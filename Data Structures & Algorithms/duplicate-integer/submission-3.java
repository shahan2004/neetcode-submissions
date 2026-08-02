class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        boolean flag=false;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            {
                 flag=true;
                 break;
            }
            else 
            {
                
                flag=false;
                
            }
        }
  return flag;  
    
}

}
