class Solution {
    public List<Integer> getRow(int rowIndex) {
        int size=rowIndex+1;
        
        List<Integer>previous=new ArrayList<>();
        previous.add(1);
         
         for(int i=0;i<rowIndex;i++)
         {
            List<Integer>current=new ArrayList<>();
            current.add(1);
            for(int j=1;j<previous.size();j++)
            {
                current.add(previous.get(j-1)+previous.get(j));
            }
            current.add(1);
            previous=current;
         }
      
        return previous;
    }
}