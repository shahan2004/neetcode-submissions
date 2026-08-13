class Solution {
    public boolean isSubsequence(String s, String t) {
        char[]s1=s.toCharArray();
        char[]s2=t.toCharArray();
        int n1=s1.length;
        int n2=s2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            if(s1[i]==s2[j])
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }

return i==n1;
        
        
    }
}