class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=nums.length;
        int[]arr=new int[2];
        int i=0;
        while(i<n)
        {
            int needed=target-nums[i];
            if(hm.containsKey(needed))
            {
               arr[0]=hm.get(needed);
               arr[1]=i; 
                break;

            }
            hm.put(nums[i],i);
            i++;

        }
        return arr;
    }
}
