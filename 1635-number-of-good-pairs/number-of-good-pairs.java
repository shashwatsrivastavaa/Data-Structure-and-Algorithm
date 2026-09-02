class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        Map<Integer,Integer>mp = new HashMap<>();
        for(int i  = 0 ; i < nums.length ; i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int ch : mp.keySet()){
            int count = mp.get(ch);
            pairs += count * (count - 1 )/2;
        }
        return pairs;
    }
}