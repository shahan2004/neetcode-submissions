class Solution {
    public int[] sortedSquares(int[] nums) {
    int n=nums.length;
    int left=0;
    int right=n-1;
    int index=n-1;
    int[]arr=new int[n];

    while(left<=right)
    {
        if(Math.abs(nums[left])>=Math.abs(nums[right]))
        {
           arr[index] =nums[left]*nums[left];
           left++;
           index--;
        }
        else if(Math.abs(nums[right])>Math.abs(nums[left]))
        {
            arr[index]=nums[right]*nums[right];
            right--;
            index--;
        }
    }
return arr;
    }
}