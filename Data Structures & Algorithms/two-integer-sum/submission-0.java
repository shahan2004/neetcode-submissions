class Solution {
    public int[] twoSum(int[] nums, int target) {
        int k,j;
        int[]arr=new int[2];
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            for(int x=0;x<n;x++)
            {

            
            if(nums[i]+nums[x]==target)
            {
                k=x;
                j=i;
                arr[0]=x;
                arr[1]=i;
                break;
    
            }
            
            }
        }
        return arr;
        

    }
}
