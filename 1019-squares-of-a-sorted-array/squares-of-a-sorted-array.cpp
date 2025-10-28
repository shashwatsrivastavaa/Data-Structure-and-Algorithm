#include<vector>
#include<math.h>

using namespace std;


class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n=nums.size();
        vector<int>answer;
        int left=0;
        int right=n-1;

        while(left<=right){
            if(abs(nums[left])>abs(nums[right])){
                answer.insert(answer.begin(),nums[left]*nums[left]);
                left++;}
            else  {
                answer.insert(answer.begin(),nums[right]*nums[right]);
                right--;
            }  

            }
            return answer;
        }

        
};