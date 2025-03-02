import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int res = -1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] > 1) {
                res = nums[i] + 1;
                break;
            }
        }
        if (res == -1) { 
          
            if (nums[0] != 0) {
                return 0;
            }
            return nums[nums.length - 1] + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {0, 1};
        System.out.println(sol.missingNumber(nums)); 
    }
}
