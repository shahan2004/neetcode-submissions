class Solution {
    public int findLucky(int[] arr) {
      int n=arr.length;
      int max=-1;
      HashMap<Integer,Integer>hm=new HashMap<>();
      for(int i=0;i<n;i++)
      {
        if(hm.containsKey(arr[i]))
        {
            hm.put(arr[i],hm.get(arr[i])+1);
        }
        else
        {
            hm.put(arr[i],1);
        }
      }
        for(int key:hm.keySet())
        {
            if(key==hm.get(key))
            {
                if(hm.get(key)>max)
                {
                    max=hm.get(key);
                }

            }
           
        }
        return max;
      }
    }
