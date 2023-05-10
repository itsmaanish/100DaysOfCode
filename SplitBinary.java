class Solution {

    public static int maxSubStr(String str) {
       int c=0;
       int d=0;
       int e=0;
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i)=='0')
           {
               c++;
           }
           if(str.charAt(i)=='1')
           {
               d++;
           }
           if(c==d&&c!=0)
           {
               e++;
               c=0;
               d=0;
           }
       }
       if(c!=0||d!=0)
       {
           return -1;
       }
       return e;
    }
}