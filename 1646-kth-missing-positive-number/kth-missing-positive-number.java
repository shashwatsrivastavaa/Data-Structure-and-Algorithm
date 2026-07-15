class Solution {
    public int findKthPositive(int[] arr, int k) {
    int missing = 0;
    int num = 1;

    while(true){
    boolean found = false;
    for(int x : arr){
        if(x == num)
        found = true;
    }
    if(!found) 
    missing++;
    if(missing == k)
    return num;
    num++;
}
        }
        
    }
