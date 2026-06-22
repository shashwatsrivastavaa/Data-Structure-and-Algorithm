class NumArray {
    int [] prefsum;

    public NumArray(int[] nums) {
        int n = nums.length;
        prefsum = new int [n];
        prefsum[0] = nums[0];
        for(int i = 1; i < nums.length ; i++){
            prefsum[i] = prefsum[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        
        if(left == 0){
            return prefsum[right];
        }
        else{
            return prefsum[right] - prefsum[left-1];
        }
        


    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */