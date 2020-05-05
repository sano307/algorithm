"""
Given an array of characters with repeats, compress it in place.
The length after compression should be less than or equal to the original array.

Example:
Input: ['a', 'a', 'b', 'c', 'c', 'c']
Output: ['a', '2', 'b', 'c', '3']
"""
class Solution(object):
  def compress(self, chars):
    countings = dict()
    result = []

    for char in chars:
        countings[char] = countings.get(char, 0) + 1

    for alphabet in countings:
        result.append(alphabet)

        if countings[alphabet] > 1:
            result.append(str(countings[alphabet]))

    return result


print Solution().compress(['a', 'a', 'b', 'c', 'c', 'c'])
