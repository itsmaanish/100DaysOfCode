class Solution{
    static String longestPalin(String A){
        // code here
        int maxPalindrone=1;
        int start=0,end=1;
        for(int i=1;i<A.length()-1;i++){
            int length=0;
            int s=i-1,e=i+1;
            while(s>=0 && e<A.length() && A.charAt(s)==A.charAt(e)){
                length+=2;
                s--;
                e++;
            }
            if(maxPalindrone<length){
                maxPalindrone=length;
                start=s+1;
                end=e;
            }
        }
        for(int i=0;i<A.length()-1;i++){
            if(A.charAt(i)==A.charAt(i+1)){
                int length=2;
                int s=i-1,e=i+2;
                while(s>=0 && e<A.length() && A.charAt(s)==A.charAt(e)){
                    length+=2;
                    s--;
                    e++;
                }
            if(maxPalindrone<length){
                maxPalindrone=length;
                start=s+1;
                end=e;
            }
            }

        }
        return A.substring(start,end);
    }
}