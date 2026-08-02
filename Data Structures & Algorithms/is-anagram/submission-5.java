class Solution {
    public boolean isAnagram(String s, String t) {
     int[]freq1=new int[26];
     int[]freq2=new int[26];
     char[]arr1=s.toCharArray();
     char[]arr2=t.toCharArray();
     int n=s.length();
     int m=t.length();
     boolean flag=false;
for(int i=0;i<n;i++) 
{
     freq1[arr1[i]-'a']++;
}
for(int i=0;i<m;i++)
{
    freq2[arr2[i]-'a']++;
}
for(int i=0;i<26;i++)
{
    if(freq1[i]==freq2[i])
    {
        flag=true;
    }
    else
    {
        flag=false;
        break;
    }
}
return flag;
    }
}
