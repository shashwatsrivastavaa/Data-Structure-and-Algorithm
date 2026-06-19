class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0;
        int right = left + 1 ;

        while(right < nums.length){
            if(nums[right]!=nums[left]){
                 left++;
                 nums[left] = nums[right];
                 right++;
            }

            else if(nums[right] == nums[left]){
                right++;
            }
        } 

        return left+1;
        
    }
}