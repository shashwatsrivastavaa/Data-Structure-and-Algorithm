class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum = 0;
        int evensum = 0;

        oddsum = n*n;
        evensum = n*(n+1);

        return gcd(oddsum,evensum);
    }
        public int gcd(int x,int y){
            while(y!=0){
                int temp = y;
                y = x%y;
                x=temp;
            }
            return x;
        }

    }
