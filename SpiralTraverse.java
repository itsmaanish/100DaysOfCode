class Solution
{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        int firstrow=0,firstcol=0,endrow=r-1,endcol=c-1;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(firstrow<=endrow && firstcol<=endcol){
           for(int i=firstcol;i<=endcol;i++){
               list.add(matrix[firstrow][i]);
            }
            if(firstrow>=endrow){
                break;
            }
            for(int i=firstrow+1;i<=endrow;i++){
                list.add(matrix[i][endcol]);
            }
            for(int i=endcol-1;i>=firstcol;i--){
                list.add(matrix[endrow][i]);
            }
            if(firstcol>=endcol){
                break;
            }
            for(int i=endrow-1;i>=firstrow+1;i--){
                list.add(matrix[i][firstcol]);
            }
            firstrow++;
            firstcol++;
            endrow--;
            endcol--;
        }
        return list;
    }
}