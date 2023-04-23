class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);    
    }

    static char[] reverse(char[] s, int start, int end){
        //when the character array is reversed (i.e. start and end pointers cross the mid) 
        if(start>end){
            return s;
        }

        //swapping character at start with character at end 
        char temp= s[start];
        s[start]= s[end];
        s[end]= temp;
        
        //recalling the function with start+1 and end-1 as start and end value
        reverse( s, start+1, end-1);
        return s;

    }
}