class Solution {
    public int lengthOfLastWord(String s) {
        char[]arr=s.toCharArray();
        int n=arr.length;
        int count=0;
        
        for(int i=n-1;i>-1;i--)
        {
            if(arr[i]==' ')
            {
                if(count==0)
                {
                    continue;
                }
                else 
                {
                    break;
                }
            }
            else
            {
                count++;
            }
            
            }
           
        
        return count;
    }
}