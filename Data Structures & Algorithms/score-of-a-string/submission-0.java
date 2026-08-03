class Solution {
    public int scoreOfString(String s) {
        char[]arr=s.toCharArray();
        int j=0;
        for(int i=1;i<arr.length;i++)
        {
          j= Math.abs( (int)arr[i-1]-(int)arr[i])+j;
        }
        return j;
    }
}