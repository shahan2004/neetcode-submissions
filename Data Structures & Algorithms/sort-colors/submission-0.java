class Solution {
    public void sortColors(int[] nums) {
        
        int n=nums.length;
        int beg=0;
        int end=n-1;
        int mid=0;
while(mid<=end){
    if(nums[mid]==0)
    {
        int temp=nums[mid];
        nums[mid]=nums[beg];
        nums[beg]=temp;
        mid++;
        beg++;

    }
    else if(nums[mid]==1)
    {
        mid++;
    }
    else if(nums[mid]==2)
    {
        int temp2=nums[mid];
        nums[mid]=nums[end];
        nums[end]=temp2;
        end--;
    }
}


    }
}