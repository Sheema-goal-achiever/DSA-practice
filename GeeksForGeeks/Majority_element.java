class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        map.put(i,map.getOrDefault(i,0)+1);
        
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        if(e.getValue()>arr.length/2) return e.getKey();
        
        return -1;
    }
}
