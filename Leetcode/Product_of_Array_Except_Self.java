// Given an integer array nums, return an array answer such that answer[i] is equal to the product 
// of all the elements of nums except nums[i].The product of any prefix or suffix of nums is 
// guaranteed to fit in a 32-bit integer.You must write an algorithm that runs in O(n) time and 
//   without using the division operation.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix[] = new int[n];
        int suffix[]=new int[n];

        prefix[0]=1;
        suffix[n-1]=1;

        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*nums[i-1];
        }

        for(int j=n-2;j>=0;j--)
        {
            suffix[j]=suffix[j+1]*nums[j+1];
        }

        int result[]=new int[n];
        for(int i=0;i<n;i++)
        result[i]=prefix[i]*suffix[i];

        return result;
    }
}
