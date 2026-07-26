class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0;

        for (int num : cardPoints) {
            totalSum += num;
        }

       
        int windowsize = n - k;
    
        int currSum = 0;
        for (int i = 0; i < windowsize; i++) {
            currSum += cardPoints[i];
        }

        int minSum = currSum;

        for (int i = n-k ; i < n; i++) {
            currSum += cardPoints[i] - cardPoints[i - (n - k)];
            minSum = Math.min(minSum, currSum);
        }

        return totalSum - minSum;
    }
}
