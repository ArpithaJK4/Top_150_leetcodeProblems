class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        def findMedianSortedArrays(nums1,nums2):
    merged = sorted(nums1 + nums2)
    n = len(merged)
    if n % 2 == 1:
        return float(merged[n // 2])
    else:
        return (merged[n // 2 - 1] + merged[n // 2]) / 2.0

# Example cases
print(findMedianSortedArrays([1,3], [2]))      # Output: 2.00000
print(findMedianSortedArrays([1,2], [3,4]))    # Output: 2.50000

    }
}
