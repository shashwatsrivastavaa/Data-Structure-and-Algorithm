import java.util.HashMap;
import java.util.Map;
class Solution {
    public int findDuplicate(int[] nums) {

        Map<Integer,Integer>mp = new HashMap<>();

        for(int n : nums){
            mp.put(n,mp.getOrDefault(n,0) + 1);
        }

        for(int  i :mp.keySet()){
            if(mp.get(i) > 1){
                return i;
            }
        }

        return -1;
        
    }
}