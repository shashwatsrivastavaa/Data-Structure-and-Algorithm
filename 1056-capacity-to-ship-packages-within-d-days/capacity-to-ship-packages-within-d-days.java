import java.util.*;
class Solution {
    static boolean isValid(int[] weights,int days,int load){
          //  load is the maximum number of load that ship carry in a day..
            int countdays = 1;
            int loadcarry = 0;

            for(int  i = 0 ; i < weights.length ; i++){
                if(loadcarry + weights[i] <= load){
                    loadcarry += weights[i];
                }
                else{
                    countdays++;
                    if(countdays  >  days){
                        return false;
                    }
                    else{
                        loadcarry = 0 ;
                        loadcarry += weights[i];
                    }
                }
                
            }
            return true;
        }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int sum = 0;
        int ans = -1;
        for(int num : weights){
            sum += num;
        }
        int left = Arrays.stream(weights).max().getAsInt(); ;  
        int right = sum ; 

        while(left <= right){
            int load = left + (right-left)/2;

            if(isValid(weights,days,load)){
                ans = load;
                right = load-1;
            }
            else{
                left = load+1;
            }
        }
        return ans;
    }
}