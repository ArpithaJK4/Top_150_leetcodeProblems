class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int card = 0;
        
        for (int num : nums) {
            if (count == 0) {
                card = num;  // Assign the current element as the candidate
            }
            if (num == card) {
                count++;  // Increment the count if the current element matches the candidate
            } else {
                count--;  // Decrement the count otherwise
            }
        }
        
        return card;
    }
}
