class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        int i=0;
        int k;
        int j=i+1;
        
        List<List<Integer>>result=new ArrayList<>();

        Arrays.sort(nums);
      
        
        for(i=0;i<n-2;i++)
        {
            if(i>0&&nums[i]==nums[i-1])
         {
            continue;
         }
            
         k=n-1;
         j=i+1;
         
         while(j<k)
         {
        
            if(nums[i]+nums[j]+nums[k]>0)
            {
                k--;
            }
           else if(nums[i]+nums[j]+nums[k]<0)
            {
                j++;
            }
            else
            {
                List<Integer>output=new ArrayList<>();
                output.add(nums[i]);
                output.add(nums[j]);
                output.add(nums[k]);
                result.add(output);
                j++;
                k--;
                while(j<k&&nums[j]==nums[j-1])
                {
                    j++;
                }
                while(j<k&&nums[k]==nums[k+1])
                {
                    k--;
                }
                
            }
         }
             }        
       
        return result;
    }
}
