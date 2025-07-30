
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int sum=0,idx=0,left=-1,right=-1;
        
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            while(sum>target)
            {
                sum-=arr[idx++];
            }
            if(sum==target)
            {
                left=idx;
                right=i;
                break;
            }
        }
        
        ArrayList<Integer> al=new ArrayList<>();
        if(left==-1 || right==-1)
        {
            al.add(-1);
        }
        else
        {
            al.add(left+1);
            al.add(right+1);
        }
        return al;
    }
}
