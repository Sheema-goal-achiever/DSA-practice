// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.
// Example 1:
// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
  
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        int count=0,max=0;
        if(nums.length==0) return 0;
        for(int i:nums)
        {
           set.add(i);
        }
        for(int i:set)
        {
            if(!set.contains(i-1))
            {
                count=1;
                int j=i;
                while(set.contains(j+1))
                {
                    count++;
                    j++;
                }
                    max=Math.max(max,count);
            }
        }
        return max;
    }
}
