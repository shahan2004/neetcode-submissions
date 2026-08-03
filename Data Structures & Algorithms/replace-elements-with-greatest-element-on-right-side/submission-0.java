class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        
        for(int j=0;j<n-1;j++)
        {
            int max=arr[j+1];
        for(int i=j+1;i<n;i++)
        {
            
            if(max<=arr[i])
            {
                max=arr[i];
            }
            
            
        }
        arr[j]=max;
        
        }
        arr[n-1]=-1;
     return arr;   
    }
}