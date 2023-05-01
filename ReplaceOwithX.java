class Solution{
    static char[][] fill(int n, int m, char a[][])
    {
        // code here
        boolean[][] vis = new boolean[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if((i==0 || j==0 || i==n-1 || j==m-1) && a[i][j]=='O' && !vis[i][j]){
                    dfs(i,j,vis,a);
                }
            }
       }
       for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                 if(!vis[i][j]){
                  a[i][j]='X';  
                }
            }
       }
       return a;
    }
    public static void dfs(int r, int c, boolean[][] vis, char[][] a){
        int n=a.length;
        int m=a[0].length;
        vis[r][c]=true;
        int delrow[] = {-1, 0, +1, 0};
        int delcol[] = {0, 1, 0, -1}; 
        for(int i=0; i<4; i++){
            int nrow= r+delrow[i];
            int ncol = c+delcol[i];
            if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && a[nrow][ncol]=='O' && !vis[nrow][ncol]){
                dfs(nrow,ncol,vis,a);
            }
        }
    }
}