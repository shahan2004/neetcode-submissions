class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hm1=new HashMap<>();
        HashMap<Character,Integer>hm2=new HashMap<>();
        char[]s1=s.toCharArray();
        char[]s2=t.toCharArray();
        int n1=s1.length;
        int n2=s2.length;
        for(int i=0;i<n1;i++)
        {
            if(hm1.containsKey(s1[i]))
            {
                hm1.put(s1[i],hm1.get(s1[i])+1);
            }
            else
            {
                hm1.put(s1[i],1);
            }
        }
            for(int i=0;i<n2;i++)
        {
            if(hm2.containsKey(s2[i]))
            {
                hm2.put(s2[i],hm2.get(s2[i])+1);
            }
            else
            {
                hm2.put(s2[i],1);
            }
        }
        if(s.length()!=t.length())
        {
            return false;
        }
        for(char k:hm1.keySet())
        {
            if(!hm2.containsKey(k)||!(hm2.get(k).equals(hm1.get(k))))
            {
                return false;
                

            }
        
            
        }
        return true;

    }
}
