class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        
        int m=words.length;
        int n=allowed.length();
        boolean[]freq=new boolean[26];
        char[]ch=allowed.toCharArray();
        for(int i=0;i<n;i++)
        { 
            freq[ch[i]-'a']=true;
        }
        for(int i=0;i<m;i++)
        {
            boolean status=true;
            for(int j=0;j<words[i].length();j++)
            {
                if(freq[words[i].charAt(j)-'a']==false)
                {
                    status=false;
                    break;
                }
                
            }
        if(status==true)
        {
            count++;
        }
        }
        return count;


    }
}