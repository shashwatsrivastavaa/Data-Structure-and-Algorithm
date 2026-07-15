class Solution {
     public boolean isValid(int[] time,int totalTrips , long mid){
            long trips = 0;
            for(int i:time){
                trips+=  mid / i;
            }
                if(trips < totalTrips){
                    return false;
                }
            
            return true;
        }
    public long minimumTime(int[] time, int totalTrips) {
    
        long  low = 0;
        long high = (long) Arrays.stream(time).min().getAsInt() * totalTrips ;
        
        long ans = -1 ;

        while ( low <= high){
            long mid = low + (high -low) /2;

            if(isValid(time,totalTrips,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}