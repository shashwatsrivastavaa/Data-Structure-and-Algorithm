class Solution {
    public boolean rotateString(String s, String goal) {
        String doubled = s + s;  
        if(s.length() != goal.length()){
            return false;
        }
        return doubled.contains(goal);
    }
}
