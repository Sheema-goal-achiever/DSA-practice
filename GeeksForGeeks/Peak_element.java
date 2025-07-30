// You are given an array arr[] where no two adjacent elements are same, find the index of a peak element. An element is considered to be a peak if it is greater than its adjacent elements (if they exist).
// If there are multiple peak elements, Return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
// Note: Consider the element before the first element and the element after the last element to be negative infinity.

class Solution {
    public int peakElement(int[] arr) {
        // code here
        int n=arr.length;
        if(n==1) return 0;
        if(arr[1]<arr[0]) return 0;
        else if(arr[n-2]<arr[n-1] ) return n-1;
        else
        {
        int left=1,right=n-2;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[mid+1]) left=mid+1;
            else right=mid-1;
        }
        }
        return -1;
    }
}
