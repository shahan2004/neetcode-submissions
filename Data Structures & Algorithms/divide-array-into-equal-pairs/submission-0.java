class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        boolean status=true;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        for(int m:hm.keySet())
        {
            if(hm.get(m)%2!=0)
            {
                status=false;
                break;
            }
        }
        return status;
    }
}