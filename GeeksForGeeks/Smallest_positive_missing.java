class Solution {
    public int missingNumber(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        if(arr[i]>=1) list.add(arr[i]);
        
        int missing=1;
        
        for(int i=0;i<n;i++)
        {
            if(!list.contains(missing))
            return missing;
            missing++;
        }
        return missing;
    }
}
