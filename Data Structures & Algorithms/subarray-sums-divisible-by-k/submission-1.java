class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int[]prefix=new int[n];
        int count=0;
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
    hm.put(0,1);
    for(int i=0;i<n;i++)
    {
        int reminder=prefix[i]%k;
        if(hm.containsKey(reminder))
        {
            count=count+hm.get(reminder);
        }
        hm.put(reminder,hm.getOrDefault(reminder,0)+1);
    }
    return count;

    }
}