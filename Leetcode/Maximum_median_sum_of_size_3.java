class Solution {
    public long maximumMedianSum(int[] nums) {
       Arrays.sort(nums);//sorting the array

     long sum=0;

       int i=0,j=nums.length;

       while(i<j)
       {
        sum+=nums[j-2];//finding the median of first and last 2 element , since it is odd the median is the middle that is j-2
        j-=2;//decrement j by 2 so that it can denote the previous 2
        i++;//going to next least element
       } 
       return sum;
    }
}
