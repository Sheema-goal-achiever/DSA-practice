class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows) return s;
        ArrayList<StringBuilder> al=new ArrayList<>();

        for(int i=0;i<numRows;i++)
        al.add(new StringBuilder());

        int row=0,di=0;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            al.get(row).append(c);
            if(row==0) di=1;
            else if(row==numRows-1) di=-1;
            row+=di;
        }
        StringBuilder sb = new StringBuilder();

        for(StringBuilder str:al)
        sb.append(str);

        return sb.toString();
        
    }
}
