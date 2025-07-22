class Solution {
    public String largestNumber(int[] nums) {
        // Step 1: Convert int[] to String[]
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Step 2: Sort with custom comparator
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
        // Example: "9" + "34" = "934", "34" + "9" = "349" → pick "934" first

        // Step 3: Join all strings together
        String result = String.join("", strNums);

        // Step 4: Handle leading zeros (like "0000" → should be "0")
        if (result.charAt(0) == '0') {
            return "0";
        }

        return result;
    }
}
