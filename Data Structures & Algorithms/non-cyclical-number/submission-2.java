class Solution {
    public boolean isHappy(int n) {
        
        int sqr=0;
        int k=0;
        boolean status=false;
        HashSet<Integer>hs1=new HashSet<>();
      while(true)
      {
       int sum=0;
    while(n!=0)
    {
        
        k=n%10;
        sqr=k*k;
        sum=sum+sqr;
        n=n/10;
    }
    
    if(sum==1)
    {
        status=true;
        break;
    }
    if(hs1.contains(sum))
    {
        status=false;
        break;
    }
    hs1.add(sum);
    n=sum;
      }

      return status;
    }
}
