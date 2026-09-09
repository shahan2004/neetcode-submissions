class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int[]prefix=new int[n];
        prefix[0]=nums[0];
        int count=0;
        for(int i=1;i<n;i++)
        {
            prefix[i]=nums[i]+prefix[i-1];
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<n;i++)
        {
            
            int needed=prefix[i]-k;
            if(hm.containsKey(needed))
            {
                count=count+hm.get(needed);
            }
                hm.put(prefix[i],hm.getOrDefault(prefix[i],0)+1);
            
        }
        return count;

    }
}