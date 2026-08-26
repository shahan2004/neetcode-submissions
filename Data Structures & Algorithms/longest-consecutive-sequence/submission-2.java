class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int current=0;
        int length=0;
        int max=0;
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!hs.contains(nums[i]))
            {
                hs.add(nums[i]);
            }
        }
        for(int k:hs)
        {
           
        if(!hs.contains(k-1))
        {
            length=1;
             current=k;
            
        }
        while(hs.contains(current+1))
        {
            length++;
            current++;
        }

        max=Math.max(length,max);
        
        

        
    }
    return max;
    }
}
