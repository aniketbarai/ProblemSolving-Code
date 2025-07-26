//2D Matrix gfg Solution...
class Solution {
    // Function to search a given integer in a matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        int found = -1;
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[i].length; j++){
                if(x == mat[i][j]){
                    found = 1;
                }
            }
        }
        if(found == 1)
           return true;
         else
           return false;
    }
}
