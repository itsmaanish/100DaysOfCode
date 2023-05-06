class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i < matrix.length; i++){
            int n = matrix[i].length - 1;
            // Finding that row.
            if(target <= matrix[i][n]){
                // Binary Search
                int s = 0;
                int e = n;
                while(s <= e){
                    int mid = s + (e - s)/2;
                    if(matrix[i][mid] == target)
                        return true;
                    else if(matrix[i][mid] < target){
                        s = mid + 1;
                    }else{
                        e = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}
