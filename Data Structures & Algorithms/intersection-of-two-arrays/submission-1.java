class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for (int i = 0; i < n1; i++) {
            if (!hs1.contains(nums1[i])) {
                hs1.add(nums1[i]);
            }
        }
        for (int i = 0; i < n2; i++) {
            if (!hs2.contains(nums2[i])) {
                hs2.add(nums2[i]);
            }
        }
        
        HashSet<Integer>result=new HashSet<>();

    for(int k:hs1)
    {
        if(hs2.contains(k))
        {
            result.add(k);
            
        }
    }
    int[]last=new int[result.size()];
    int x=0;
    for(int k:result)
    {
        last[x]=k;
        x++;
    }
    return last;
      
    }
}