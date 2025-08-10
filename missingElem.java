/*
~GFG
You are given an array arr[] of 
size n - 1 that contains distinct
integers in the range from 1 to n
(inclusive). This array represents
a permutation of the integers from 1
to n with one element missing. 
Your task is to identify and return 
the missing element.
*/
class Solution {
    long missingNum(int arr[]) {
        long arrSum = 0;
        long n = arr.length+1;
        long totalSum = n*(n+1)/2;
      for(long i : arr){
          arrSum+= i;
      }
      return totalSum-arrSum;
    }
}
