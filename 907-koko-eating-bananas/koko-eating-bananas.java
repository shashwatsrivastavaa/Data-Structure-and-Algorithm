class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = high;
        int n = piles.length;

        while (low <= high){
            int mid  = low + (high - low) / 2;

            if(isValid(piles,h,mid)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public boolean isValid(int[] piles, int h , int mid){
        int hrs= 0;

        for(int pile : piles){
            hrs += (pile + mid -1) /mid; // yaar isko calculate krna yaad rakhoo...
              if(hrs > h)
                return false;
        }
    return true;
}
}