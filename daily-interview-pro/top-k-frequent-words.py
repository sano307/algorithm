"""
Given a non-empty list of words, return the k most frequent words.
The output should be sorted from highest to lowest frequency, and if two words have the same frequency,
the word with lower alphabetical order comes first. Input will contain only lower-case letters.

Example:
Input: ["daily", "interview", "pro", "pro", 
"for", "daily", "pro", "problems"], k = 2
Output: ["pro", "daily"]
"""
from collections import Counter

class Solution(object):
  def topKFrequent(self, words, k):
    counter = Counter(words)
    frequencies = {}

    for word, count in counter.items():
      if count not in frequencies:
        frequencies[count] = []
      frequencies[count].append(word)
    
    result = []
    for i in range(len(words), 0, -1):
      if i in frequencies:
        for word in frequencies[i]:
          result.append((word, i))
        if len(result) >= k:
          break
    
    result = sorted(result, reverse=True, key=lambda x: x[1])
    return [element[0] for element in result]


words = ["daily", "interview", "pro", "pro", "for", "daily", "pro", "problems"]
k = 2
print Solution().topKFrequent(words, k)
