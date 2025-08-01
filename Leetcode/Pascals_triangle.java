class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> rows=new ArrayList<>(Collections.nCopies(i+1,1));

            for(int j=1;j<i;j++)
            {
                int val=result.get(i-1).get(j-1)+result.get(i-1).get(j);
                rows.set(j,val);
            }
            result.add(rows);
        }

        return result;
    }
}
