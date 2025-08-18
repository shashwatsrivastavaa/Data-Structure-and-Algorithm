class Solution {
public:
    bool isPalindrome(int x) {
        int temp=x;
        int temp2=0;
        if((x>INT_MAX)&&(x<INT_MIN))
            return false;
        while(x>0){
        int a=x%10;
        if (temp2 > (INT_MAX - a) / 10) return false;

         temp2=temp2*10+a;
        x=x/10;

    }
        return(temp2==temp);
        }
};