class Solution {
    public int characterReplacement(String s, int k) {
        char[]ch=s.toCharArray();
        int n=ch.length;
    
        int left=0;
        int count=0;
        int[]freq=new int[26];
        int max=0;
        int maxfreq=0;
    
        
        for(int right=0;right<n;right++)
        {
    
            
            freq[ch[right]-'A']++;
            maxfreq=Math.max(maxfreq, freq[ch[right]-'A']);
            while((right-left+1)-maxfreq>k)
            {
                
                freq[ch[left]-'A']--;
               left++;

            }
            
            
                max=Math.max(max,right-left+1);
            
        }
        return max;
        }
    }

