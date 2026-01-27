class Solution {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {
        int p = num.size()-1;

        vector<int>sum;

        while(p>=0 || k>0){
            if(p>=0){
            k=k+num[p];
            p--;
        }
        sum.push_back(k%10);
        k=k/10;
    }
        reverse(sum.begin(),sum.end());
 
     return sum;   
    }

};