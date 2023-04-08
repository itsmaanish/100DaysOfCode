// Geeks for Geeks
/*Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Example 1:

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6 */


// import java.io.*;
// import java.util.*;
// class GfG
// {
//     public static void main (String[] args)
//     {
        
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
        
//         while(t-- > 0)
//         {
//             int n = sc.nextInt();
//             ArrayList<Integer> arr = new ArrayList<>();
//             for(int i = 0;i<n;i++)
//                 {
//                     int x = sc.nextInt();
//                     arr.add(x);
//                 }
//             int m = sc.nextInt();
            
//             Solution ob = new Solution();
            
//     		System.out.println(ob.findMinDiff(arr,n,m));
//         }
        
//     }
// }
// GFG
class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        
        Collections.sort(a);                   // Sorting an Array
        int minDiff = Integer.MAX_VALUE;      // to find minimum Value
    
        // (i+m-1<n) --> i starts from 0 to m-1 and it should be less than n=8
        
        for(int i=0;i+m-1<n;i++){      // n--> No. of Array, m--> No of Students
            minDiff = Math.min(a.get(i+(int)m-1)-a.get(i),minDiff);
        }
    return minDiff;
    }

    
}


