
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

// Time complexity :- O(NlogN)
// Space complexity :- O(1)
