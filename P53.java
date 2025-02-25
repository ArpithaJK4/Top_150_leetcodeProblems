class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0];
        int current_sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>current_sum + nums[i]){
             current_sum=nums[i];
             max_sum =Math.max(current_sum,max_sum);
            }else{
        current_sum =current_sum + nums[i];
        max_sum = Math.max(current_sum,max_sum);
        }
        }
        return max_sum;
    }
}
