class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int n=nums.length;
        boolean status=false;
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
            for(int k:hm.keySet())
            {
                if(hm.get(k)>1)
                {
                    status=true;
                    break;
                }
            }
            return status;

        }
    }
