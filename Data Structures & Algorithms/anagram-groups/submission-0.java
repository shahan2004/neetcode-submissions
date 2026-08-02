class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            int[]freq=new int[26];
            for(int j=0;j<strs[i].length();j++)
        {
            freq[strs[i].charAt(j)-'a']++;
            
        
        }
         String key=Arrays.toString(freq);
        if(hm.containsKey(key))
        {
            hm.get(key).add(strs[i]);
            
            
        }
        else
        {
            List<String> values = new ArrayList<>();
            values.add(strs[i]);
            hm.put(key,values);
        }
    
    
        

    }
    return new ArrayList<>(hm.values());
    }
}
