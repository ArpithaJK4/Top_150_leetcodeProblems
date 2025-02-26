class Solution {
    public boolean canJump(int[] nums) {
        int result=0;
        boolean flag=true;
    for(int i=0;i<nums.length;i++){
        if(i>result){
            return false;
        }
        result=Math.max(result,i+nums[i]);
        if(result>=nums.length-1){
            return true;
        }
    }return false;}
    
}
