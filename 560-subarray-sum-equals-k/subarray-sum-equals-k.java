
import java.util.Map;
import java.util.HashMap;
class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count = 0;
        // for(int left = 0 ; left< nums.length ;left++){
        //     int sum = 0;
        //     for(int right = left ; right < nums.length ;right++ )  {
        //             sum = sum + nums[right];
        //             if(sum == k){
        //                 count++;
        //             }
        //     }    
        //       }
        //     return count;
        Map<Integer,Integer>mp = new HashMap<>();
        int prefsum = 0;
        int count = 0;
        mp.put(0,1);

        for(int i  : nums){
            prefsum += i;
        

        int need = prefsum - k;

        if(mp.containsKey(need)){
            count += mp.get(need);
        }
        mp.put(prefsum,mp.getOrDefault(prefsum,0) + 1);
        }
        return count;

    }
}