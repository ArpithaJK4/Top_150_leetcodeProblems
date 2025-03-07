from collections import defaultdict
from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = defaultdict(list)
        
        for word in strs:
            char_count = [0] * 26  # Since input contains only lowercase letters
            
            for char in word:
                char_count[ord(char) - ord('a')] += 1  # Count occurrences
            
            anagram_map[tuple(char_count)].append(word)  # Use tuple as key

        return list(anagram_map.values())
