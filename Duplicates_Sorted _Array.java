class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        ArrayList<Integer> numas = new ArrayList<>();
        numas.add(nums[0]); // Add the first element
        
        for (int i = 1; i < nums.length; i++) {
            boolean checker = false;
            for (int j = 0; j < numas.size(); j++) {
                if (nums[i] == numas.get(j)) {
                    checker = true;
                    break;
                }
            }
            if (!checker) {
                numas.add(nums[i]);
            }
        }
        
        // Copy unique elements back to nums array
        for (int i = 0; i < numas.size(); i++) {
            nums[i] = numas.get(i);
        }
        
        return numas.size();
    }
}
