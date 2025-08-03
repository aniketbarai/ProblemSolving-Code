/*
Given an array arr[] containing only 
non-negative integers, your task is 
to find a continuous subarray 
(a contiguous sequence of elements) whose 
sum equals a specified value target. You 
need to return the 1-based indices of 
the leftmost and rightmost elements of 
this subarray.
You need to find the first subarray 
whose sum is equal to the target.

Note: If no such array is possible then, return [-1].
*/
//Sliding Window Pattern...
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0;
        int currSum = 0;
        for(int end = 0; end<arr.length; end++){
            currSum += arr[end];
            while(currSum > target && start < end){
                currSum-= arr[start];
                start++;
            }
            if(target == currSum){
                result.add(start+1);
                result.add(end+1);
                break;
            }
        }
        if(result.isEmpty()){
            result.add(-1);
        }
        return result;
    }
}


