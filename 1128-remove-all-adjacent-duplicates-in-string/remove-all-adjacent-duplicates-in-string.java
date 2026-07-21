class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (ans.length() > 0 && ans.charAt(ans.length() - 1) == curr) {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(curr);
            }
        }
        return ans.toString();
    }
}