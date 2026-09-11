class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,1);
        int count=0;
        int currentsum=0;
        int oldsum=0;
        for(int i=0;i<n;i++)
        {
            currentsum=currentsum+nums[i];
            int needed=currentsum-goal;
            if(hm.containsKey(needed))
            {
                count=count+hm.get(needed);
            }
            hm.put(currentsum,hm.getOrDefault(currentsum,0)+1);
        }
        return count;
    }
}