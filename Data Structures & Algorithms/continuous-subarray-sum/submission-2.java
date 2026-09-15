class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        int currentsum=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<n;i++)
        {
            currentsum=currentsum+nums[i];
            int reminder=currentsum%k;
            if(hm.containsKey(reminder))
            {
                if(i-hm.get(reminder)>=2)
                {
                    return true;
                }
            }
            else
            {
                hm.put(reminder,i);
            }
        }
return false;
    }
}