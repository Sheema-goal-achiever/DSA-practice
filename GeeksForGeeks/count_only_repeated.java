class Solution {
    public ArrayList<Integer> findRepeating(int[] arr) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        map.put(i,map.getOrDefault(i,0)+1);
        
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>1)
            {
            result.add(e.getKey());
            result.add(e.getValue());
            return result;
            }
            
        }
        result.add(-1);
        result.add(-1);
        return result;
    }
}
