class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        //new
        int lines = 1;
        int currentWidth = 0;

        for (char ch : s.toCharArray()) {
            int charWidth = widths[ch - 'a'];
            if (currentWidth + charWidth > 100) {
                lines++;
                currentWidth = charWidth;
            } else {
                currentWidth += charWidth;
            }
        }

        return new int[]{lines, currentWidth};
    }
}
