class Solution {
    public static boolean judgeSquareSum(int c) {
        int left = 0, right = (int) Math.sqrt(c);

        while (left <= right) {
            long sumSquares = (long) left * left + (long) right * right; // Use long to avoid overflow
            if (sumSquares == c) {
                return true;
            } else if (sumSquares < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }
}
