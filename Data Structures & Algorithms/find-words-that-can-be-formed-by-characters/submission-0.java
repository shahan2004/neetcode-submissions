class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum=0;
        int n=words.length;
        int l=words.length;
        HashMap<Character,Integer>hm1=new HashMap<>();
       
        
        char[]ch1=chars.toCharArray();
        int m=ch1.length;
        for(int i=0;i<m;i++)
        {
            if(hm1.containsKey(ch1[i]))
            {
                hm1.put(ch1[i],hm1.get(ch1[i])+1);
            }
            else
            {
                hm1.put(ch1[i],1);
            }
        }
         for(int i=0;i<l;i++)
         {
            char[]ch2=words[i].toCharArray();
            HashMap<Character,Integer>hm2=new HashMap<>();
            for(int x=0;x<words[i].length();x++)
        {
            if(hm2.containsKey(ch2[x]))
            {
                hm2.put(ch2[x],hm2.get(ch2[x])+1);
            }
            else
            {
                hm2.put(ch2[x],1);
            }
        }
        boolean status=true;
        for(char key:hm2.keySet())
       {
       int needed= hm2.get(key);
       int available=hm1.getOrDefault(key,0);
       if(needed>available)
       {
        status=false;
        break;
       }
       
       }
       if(status==true)
       {
        sum=sum+words[i].length();
       }

     
        
    }
    return sum;
}
}