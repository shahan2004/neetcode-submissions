class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length-1;
        int left=0;
        int right=n;
        int max1=0;
        int current=0;
        int width=right-left;
        int height=Math.min(heights[left],heights[right]);
        
        while(left<right)
        {
             width=right-left;
             height=Math.min(heights[left],heights[right]);
             current=height*width;
             if(current>=max1){
             current=height*width;
             max1=current;
             }
            if(Math.min(heights[left],heights[right])==heights[left])
            {
                left++;
            }
            else if(Math.min(heights[left],heights[right])==heights[right])
            {
                right--;
            }
        }
        return max1;
    }
}
