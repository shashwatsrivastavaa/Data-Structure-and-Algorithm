class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int smallest = Arrays.stream(nums).min().getAsInt();
        int largest = Arrays.stream(nums).max().getAsInt();

        for (int i = smallest; i <= largest; i++) {
            boolean found = false;

            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }

            if(found == false) {
                result.add(i);
            }
        }
        return result;
    }
}