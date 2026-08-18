class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer,Integer>mp = new HashMap<>();
        int n = nums.length;
    //  Check frequency of each characterr.....
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
    //  Three base cases.....
        if(k == n){
            return Arrays.stream(nums).max().getAsInt();
        }
        if(k==1){
            int max = -1;
            for(int num : nums){
                if(mp.get(num) == 1){
                    max = Math.max(num,max);
                }
            }
            return max;
        }

        List<Integer> candidates = new ArrayList<>();
        if (mp.get(nums[0]) == 1) 
        candidates.add(nums[0]);
        if (mp.get(nums[n - 1]) == 1) 
        candidates.add(nums[n - 1]);
        
        return candidates.isEmpty() ? -1 : Collections.max(candidates);
    }
}