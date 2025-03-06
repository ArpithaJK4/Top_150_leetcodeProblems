class Solution:
    def isPalindrome(self, s: str) -> bool:
         cleaned_s = re.sub(r'[^a-zA-Z0-9]', '', s).lower()
    # Check if it reads the same forward and backward
         return cleaned_s == cleaned_s[::-1]
