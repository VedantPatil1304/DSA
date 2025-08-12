class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int third = Integer.MIN_VALUE; // potential nums[k]
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < third) return true; // nums[i] is nums[1]
            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                third = stack.pop(); // stack.pop() is potential nums[k]
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
