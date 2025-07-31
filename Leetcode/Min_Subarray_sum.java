class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        
        int count=0,sum=0,min=Integer.MAX_VALUE,idx=0,n=arr.length;

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            count++;

           
            while(sum>=target)
            {
                min=Math.min(min,i-idx+1);
                sum-=arr[idx++];
            }

        }
      
        return (min==Integer.MAX_VALUE)?0:min;
    }
}
