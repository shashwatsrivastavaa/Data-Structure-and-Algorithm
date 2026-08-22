class Solution {
    public boolean checkDivisibility(int n) {
        boolean correct = false;
        int main = n;
        int checksum = 0 ;
        int checkproduct = 1;
        int total = 0;
        while(n!=0){
            int temp = n%10;
            checksum += temp;
            checkproduct *= temp;
            n=n/10;
        }
        total = checksum + checkproduct;
        if(main % total == 0){
            correct = true;
        }
        return correct;
   }
}