// import java.util.*;
// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n  = nums.length;
//         Set<List<Integer>> output = new HashSet<>();
//         for(int i = 0 ; i< n-2 ;i++){
//             for( int j = i+1 ;j<n-1;j++){
//                 for(int k= j+1 ; k< n;k++){
//                     if(nums[i] + nums[j] +nums[k] == 0 ){
//                             List<Integer> temp =new ArrayList<>() ;
//                             temp.add(nums[i]);
//                             temp.add(nums[j]);
//                             temp.add(nums[k]);
//                             Collections.sort(temp);
//                             output.add(temp);
//                     }
//                 }
//             }

//         }
//         return new ArrayList<>(output) ;
//     }
// }



import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        Set<List<Integer>> result = new HashSet<>();  

        for (int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    left++;
                    right--;
                    
                }
                if (sum < 0) {
                    left++;
                }
                if (sum > 0) {
                    right--;
                }
            }
        }
        
        return  new ArrayList<>(result); 
    }
}