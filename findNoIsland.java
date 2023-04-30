class Solution {
    public void land(int i, int j, char[][] a){
        if(i<0 || j < 0 || i >= a.length || j >= a[0].length){
            return ;
        }
        
        if(a[i][j] == '0')
            return ;
        a[i][j] = '0';
        land(i+1,j,a);
        land(i-1,j,a);
        land(i,j+1,a);
        land(i,j-1,a);
        land(i+1,j+1,a);
        land(i-1,j-1,a);
        land(i-1,j+1,a);
        land(i+1,j-1,a);
    }
    public int numIslands(char[][] grid) {
        int ans = 0;
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ;j++){
                if(grid[i][j] == '1'){
                    land(i,j,grid);
                    ans++;
                }
            }
        }
        return ans;
    }
}
