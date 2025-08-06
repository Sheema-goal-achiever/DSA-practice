class Solution {
    public boolean isPrime(int n)
    {
        if(n==1 || n==0) return false;
        else if(n==2||n==3) return true;
        else
        {
            for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        }
        return true;
    }
    public long splitArray(int[] nums) {
        long sum1=0,sum2=0;

        for(int i=0;i<nums.length;i++)
        {
            if(isPrime(i))
            sum1+=(long)nums[i];
            else 
            sum2+=(long)nums[i];
        }

        return Math.abs(sum1-sum2);
    }
}
