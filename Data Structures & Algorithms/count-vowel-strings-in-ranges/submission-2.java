class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
         int n=words.length;
         int[]arr=new int[n];
         
         for(int i=0;i<n;i++)
         {
                 char first = words[i].charAt(0);
         char last = words[i].charAt(words[i].length() - 1);
            if((first=='a'||first=='e'||first=='i'||first=='o'||first=='u')&&(last=='a'||last=='e'||last=='i'||last=='o'||last=='u'))
            {
                arr[i]=1;
            }
            else
            {
                arr[i]=0;
            }
         }
        int[]prefix=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }

        int m=queries.length;
        int[]ans=new int[m];
    
        for(int i=0;i<m;i++)
        {
           int left=queries[i][0];
           int right=queries[i][1];
            
                if(left==0)
                {
                    ans[i]=prefix[right];
                }
                else
                {
                    ans[i]=prefix[right]-prefix[left-1];
                }
            
        }
        return ans;

    }
}