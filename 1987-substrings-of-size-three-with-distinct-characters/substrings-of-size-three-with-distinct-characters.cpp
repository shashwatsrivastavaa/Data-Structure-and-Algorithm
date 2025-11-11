

class Solution {
public:
    int countGoodSubstrings(string s) {
    int count= 0;
    int d=s.length();

    for (int i = 0; i <= (d-3); i++) {
        char a = s[i], b = s[i+1], c = s[i + 2];
        if (a!= b && b!= c && a!= c) {
            count++;
        }
    }

    return count;
    }
};