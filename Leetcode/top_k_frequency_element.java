// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        map.put(i,map.getOrDefault(i,0)+1);
        
         PriorityQueue<Integer> heap = new PriorityQueue<>(
            (a,b) -> map.get(a) - map.get(b)
        );
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            heap.add(e.getKey());
            if(heap.size()>k) heap.poll();

        }
        int[] result = new int[k];
        for(int i=k-1; i>=0; i--) {
            result[i] = heap.poll();
        }
        return result;
    }
}
