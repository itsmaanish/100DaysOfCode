class MaximumSubArray {
    public int maxSubArray(int[] nums){
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            max = Math.max(sum,max); 
            /* Math.max returns the largest number from the given as input parameters*/
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
}
