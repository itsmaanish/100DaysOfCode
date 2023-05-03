class Solution{
    public String removeConsecutiveCharacter(String S){
        String ans = Character.toString(S.charAt(0));
        int i=1;
        while(i<S.length()){
            if((S.charAt(i))!=(S.charAt(i-1))){
                ans+=(S.charAt(i));
            }
            i++;
        }
        return ans;
    }
}
