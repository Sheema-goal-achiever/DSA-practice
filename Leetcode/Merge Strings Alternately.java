// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, 
// starting with word1. If a string is longer than the other, append the additional letters onto the 
// end of the merged string.
// Return the merged string.
// Example 1:
// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result=new StringBuilder();
        int n=word1.length() , m=word2.length();
        int i=0,j=0;
        while(i<n || j<m)
        {
            if(i<=n-1 && j<=m-1)
            {
                result.append(word1.charAt(i));
                result.append(word2.charAt(j));
                i++;
                j++;
            }
            else if(j<m)
            {
                result.append(word2.charAt(j));
                j++;
            }
            else if(i<n)
            {
                result.append(word1.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}
