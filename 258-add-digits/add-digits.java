class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int temp = num % 10;
            sum += temp;
            num = num / 10;
        }
        while (sum > 9) {
            int newsum = 0;
            while (sum!= 0) {
                int temp = sum % 10;
                newsum += temp;
                sum = sum / 10;
            }
            sum = newsum;  
        }

        return sum; 
    }
}
