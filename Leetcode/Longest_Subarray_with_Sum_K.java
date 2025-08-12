// Given an array arr[] containing integers and an integer k, your task is to
// find the length of the longest subarray where the sum of its elements is equal 
//   to the given value k. If there is no subarray with sum equal to k, return 0.

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int nums[]=new int[arr.length];
        nums[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            nums[i]=nums[i-1]+arr[i];
        }
        int result=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
       {
           if(nums[i]==k)
           result=Math.max(result,i+1);
           if(!map.containsKey(nums[i]))
           {
               map.put(nums[i],i);
           }
           if(map.containsKey(nums[i]-k))
           result=Math.max(result,i-map.get(nums[i]-k));
       }
        
        return result;
    }
}
