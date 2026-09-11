class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]prefix=new int[n];
        int[]suffix=new int[n];
        prefix[0]=1;
        int product=1;
        for(int i=1;i<n;i++)
        {   
             product=product*nums[i-1];
            prefix[i]=product;
        }
        suffix[0]=1;
        int product2=1;
        for(int i=1;i<n;i++)
        {
            product2=product2*nums[n-i];
            suffix[i]=product2;
        }
        int[]suff=new int[n];
        for(int i=0;i<n;i++)
        {
            suff[i]=suffix[n-i-1];
        }
        int[]result=new int[n];
        for(int i=0;i<n;i++)
        {
            result[i]=prefix[i]*suff[i];
        }
    return result;
    } 
}  
