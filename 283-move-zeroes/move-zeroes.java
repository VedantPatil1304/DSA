class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0; // Pointer to track the position of the next non-zero element
        
        for (int i = 0; i < n; i++) {
            // Only perform the swap if the current element is non-zero and i != j
            if (nums[i] != 0) {
                if (i != j) {
                    swap(nums, i, j);
                }
                j++; // Move the pointer for the next non-zero position
            }
        }
    }

    // Swap elements at indices a and b in the array
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
