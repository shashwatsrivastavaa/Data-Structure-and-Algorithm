class Solution {
public:
    int trap(vector<int>& height) {
        int left = 0;
        int right=height.size()-1;
        int ans=0;
        int LeftMax=0;
        int RightMax=0;

         while(left<=right){
           if(height[left]<height[right]){
            if(height[left]>=LeftMax){
                LeftMax=height[left];
            }
            else{
               ans= LeftMax-height[left]+ans;
            }
            left++;
           }
           else{
            if(height[right]>=RightMax){
                RightMax=height[right];
            }
            else{
              ans=RightMax-height[right]+ans;
            }
            right--;
           }
            
    }

     return ans;
     }
};