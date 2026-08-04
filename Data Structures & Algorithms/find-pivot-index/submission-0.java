class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=0;
        int total=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            total=total+nums[i];
        }
        for(int i=0;i<n;i++)
        {
            
            right=total-nums[i]-left;
            if(right!=left)
            {
                if(right==0)
                {
                    count=-1;
                    break;
                }
                left=left+nums[i];

            }
            else if(left==right)
            {
                count=i;
                break;
            }
           
        
        }
        return count;
    }
}