// Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.
// Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.

class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int floor = -1,left=0,right=arr.length-1;
       while(left<=right)
       {
           int mid=(left+right)/2;
           if(arr[mid]<=x)
           {
               floor=mid;
               left=mid+1;
           }
           else 
           right=mid-1;
       }
       return floor;
    }
}

