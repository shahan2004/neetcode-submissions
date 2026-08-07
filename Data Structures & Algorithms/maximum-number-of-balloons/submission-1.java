class Solution {
    public int maxNumberOfBalloons(String text) {
       char[]ch=text.toCharArray();
       int n=ch.length;

       

       int[]freq=new int[26];

       for(int i=0;i<n;i++)
       {
        freq[ch[i]-'a']++;
       } 

        int[]possible={
            freq['b'-'a'],
            freq['a'-'a'],
            freq['l'-'a']/2,
            freq['o'-'a']/2,
            freq['n'-'a']
        };
        int min=possible[0];
        for(int i=1;i<possible.length;i++)
        {
            if(possible[i]<min)
            {
                min=possible[i];
            }
        }

    
    return min;
}
}
