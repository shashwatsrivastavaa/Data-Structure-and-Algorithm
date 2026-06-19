import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

     Set<Integer>temp = new HashSet<>();
     for(int n : nums){
        if(temp.contains(n))
        return true;
        temp.add(n);
     }
        return false;
    }
}

