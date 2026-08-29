import java.util.*;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] result = new int[n];

    
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i]; 
            arr[i][1] = i;       
        }

        
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        
        int i = 0;
        while (i < n) {
            List<Integer> indices = new ArrayList<>();
            List<Integer> values = new ArrayList<>();

            indices.add(arr[i][1]);
            values.add(arr[i][0]);

            int j = i;
            while (j + 1 < n && Math.abs(arr[j+1][0] - arr[j][0]) <= limit) {
                j++;
                indices.add(arr[j][1]);
                values.add(arr[j][0]);
            }

            
            Collections.sort(indices);
            Collections.sort(values);

            
            for (int k = 0; k < indices.size(); k++) {
                result[indices.get(k)] = values.get(k);
            }

            i = j + 1;
        }

        return result;
    }
}
