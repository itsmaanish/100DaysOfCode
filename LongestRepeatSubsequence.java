class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        int n = str.length();
        int dp [][] = new int[n+1] [n+1];
        for(int i =n - 1 ; i>= 0; i-- ){
            for(int j = n -1; j >= 0; j--){
                if( str.charAt(i) == str.charAt(j) && i != j){
                    dp[i][j] = dp[i+1][j+1] + 1;
                } else{
                    dp[i][j] = Math.max(dp[i][j+1], dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }
}
