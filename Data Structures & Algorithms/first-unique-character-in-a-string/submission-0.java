class Solution {
    public int firstUniqChar(String s) {
        char[]str=s.toCharArray();
        int n=str.length;
        
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(str[i]))
            {
                hm.put(str[i],hm.get(str[i])+1);
            }
            else
            {
                hm.put(str[i],1);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(hm.get(str[i])==1)
            {
                 return i;
            }
        }
        return -1;

    }
}