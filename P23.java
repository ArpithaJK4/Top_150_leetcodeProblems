import java.util.HashSet;

class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0, currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            currSum += nums[right];
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
