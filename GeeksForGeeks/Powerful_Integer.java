class Solution {
    public int powerfulInteger(int[][] arr, int k) {
        // code here
        Map<Integer,Integer> map=new TreeMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            int start=arr[i][0];
            int end=arr[i][1];
            
           
            map.put(start,map.getOrDefault(start,0)+1);
            map.put(end+1,map.getOrDefault(end+1,0)-1);
        }
        
        int max=-1,count=0,prev=-1;
        
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
           int point=e.getKey();
           if(prev!=-1 && count>=k)
           max=point-1;
           count+=e.getValue();
           prev=point;
        }
        return max;
    }
}
