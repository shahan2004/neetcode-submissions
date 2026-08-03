class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        // Count frequency
        for(int i = 0; i < nums.length; i++)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        // Create buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        for(int key : hm.keySet())
        {
            int freq = hm.get(key);

            if(bucket[freq] == null)
            {
                bucket[freq] = new ArrayList<>();
                bucket[freq].add(key);
            }
            else
            {
                bucket[freq].add(key);
            }
        }

        // Collect top K
        int[] fin = new int[k];
        int index = 0;

        for(int i = bucket.length - 1; i >= 0; i--)
        {
            if(bucket[i] != null)
            {
                for(int j = 0; j < bucket[i].size(); j++)
                {
                    fin[index] = bucket[i].get(j);
                    index++;

                    if(index == k)
                    {
                        return fin;
                    }
                }
            }
        }

        return fin;
    }
}