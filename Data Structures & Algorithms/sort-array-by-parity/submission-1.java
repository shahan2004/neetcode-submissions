class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;

       int index=0;
       int i=0;
       while(i<n)
       {
        if(nums[i]%2==0)
        {
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            i++;
            index++;
        }
        else
        {
            i++;
        }
       }
        return nums;
      
    }
}