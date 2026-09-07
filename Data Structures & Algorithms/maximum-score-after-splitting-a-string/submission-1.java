class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        int sum=0;
        int max=0;
        int left=0;
        int right=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                right++;
            }
        }
        
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==0)
            {
                left++;
            }
            else
            {
                right--;
            }
            sum=left+right;
            max=Math.max(sum,max);

            
        }
        return max;

    }
}