class Solution {
    public int countSeniors(String[] details) {
        String s;
        int count=0;
        int n=details.length;
        for(int i=0;i<n;i++)
        {
           s=details[i].substring(11,13);
           int age=Integer.parseInt(s);
           if(age>60)
           {
            count++;
           }
        }
        return count;
    }
    
}