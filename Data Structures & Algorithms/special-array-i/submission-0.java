class Solution {
    public boolean isArraySpecial(int[] nums) {
        
        boolean status=true;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(status==false)
            {
                break;
            }
            for(int j=i+1;j<n;j++)
            {
                if((nums[i]%2==0 && nums[j]%2!=0)||(nums[i]%2!=0 && nums[j]%2==0))
                {
                    status=true;
                    break;
                }
                else{
                    status=false;
                    break;
                }
                
            }
        }
        return status;
    }
}