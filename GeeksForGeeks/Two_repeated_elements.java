// You are given an integer n and an integer array arr of size n+2. All elements of the array are in the range from 1 to n. Also, all elements occur once except two numbers which occur twice. Find the two repeating numbers.
// Note: Return the numbers in their order of appearing twice. So, if x and y are repeating numbers, and x's second appearance comes before the second appearance of y, then the order should be (x, y).
class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        Map<Integer,Integer> map=new LinkedHashMap<>();
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
        map.put(val,map.getOrDefault(val,0)+1);
        
        if(map.get(val)==2)
        list.add(new int[]{val,i});
        }
        
        list.sort((a,b)->Integer.compare(a[1],b[1]));
        int result[]=new int[2];
        for(int i=0;i<2;i++)
        result[i]=list.get(i)[0];
        return result;
    }
}
