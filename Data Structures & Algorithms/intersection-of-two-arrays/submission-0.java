class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;

       int i=0;
       int j=0;
       int index=0;
       
       int[]arr=new int[Math.min(n1,n2)];

      Arrays.sort(nums1);
      Arrays.sort(nums2);

      while(i<n1 && j<n2)
      {
        if(nums1[i]==nums2[j])
        {
            if(index==0||arr[index-1]!=nums1[i])
            {
            arr[index]=nums2[j];
            index++;
            }
            
            i++;
            j++;
            
        }
        else 
        {
            if(nums1[i]<nums2[j])
            {
            i++;
            }
            else if(nums2[j]<nums1[i])
            {
            j++;
            }
        }

      }
      int[]result=new int[index];
      for(int k=0;k<index;k++)
      {
        result[k]=arr[k];
      }
      return result;

    }
}