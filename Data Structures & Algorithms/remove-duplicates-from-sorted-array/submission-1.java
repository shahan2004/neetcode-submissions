class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
         
         int index=0;
           for(int i=0;i<n;i++)
           {
            if(i==0)
            {
                index++;
            }
            else if(nums[i]==nums[i-1])
            {
                continue;
            }
            else
            {
                nums[index]=nums[i];
                index++;
            }
            
           }
       
    return index;
    }
}