class Solution:
    def countVowelSubstrings(self, word: str) -> int:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        count = 0

        # Iterate over all possible substrings
        for i in range(len(word)):
            unique_vowels = set()
            for j in range(i, len(word)):
                if word[j] in vowels:
                    unique_vowels.add(word[j])
                    if len(unique_vowels) == 5:  # All 5 vowels found
                        count += 1
                else:
                    break  # Stop when encountering a non-vowel
        return count

# Example usage:
sol = Solution()
print(sol.countVowelSubstrings("aeiouu"))  # Output: 2
print(sol.countVowelSubstrings("unicornarihan"))  # Output: 0
print(sol.countVowelSubstrings("cuaieuouac"))  # Output: 7
