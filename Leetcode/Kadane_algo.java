// Given an integer array nums, find the subarray with the largest sum, and return its sum.
class Solution {
    public int maxSubArray(int[] nums) {
        int current =nums[0] , result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            current=Math.max(nums[i],current+nums[i]);
            result=Math.max(result,current);
        }

        return result;
    }
}
