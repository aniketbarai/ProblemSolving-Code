/*
Given an array of positive integers arr[], 
return the second largest element from 
the array. 
If the second largest element doesn't 
exist then return -1.

Note: The second largest element
should not be equal to the largest
element.

*/
class Solution {
    public int getSecondLargest(int[] arr) {
        int max = 0;
        int secMax = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] < max && arr[i] > secMax){
                secMax = arr[i];
            }
        }
       return secMax;
    }
}
