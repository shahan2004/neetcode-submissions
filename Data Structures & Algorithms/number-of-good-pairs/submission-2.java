class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int count=0;
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(freq.containsKey(nums[i]))
            {
                count=count+freq.get(nums[i]);
                freq.put(nums[i],freq.get(nums[i])+1);
                
            }
            else
            {
                freq.put(nums[i],1);
            }
        }
        return count;
    }
}