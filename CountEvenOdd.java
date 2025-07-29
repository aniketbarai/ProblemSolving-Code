//gfg problem..
class Solution {
    public int[] countOddEven(int[] arr) {
        int oddCount = 0,evenCount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
            if(arr[i] %2 != 0){
                oddCount++;
            }
        }
        return new int[]{
            oddCount,evenCount
        };
        //System.out.println(evenCount +" "+ oddCount);
    }
}
