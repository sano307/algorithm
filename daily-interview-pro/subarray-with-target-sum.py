"""
You are given an array of integers, and an integer K.
Return the subarray which sums to K. You can assume that a solution will always exist.

Example:
Input: [1, 3, 2, 5, 7, 2], 14
Output: [2, 5, 7]
"""
class Solution(object):
  def find_continuous_k(self, list, k):
    previous = dict()
    sum = 0

    previous[0] = -1
    for last_idx, item in enumerate(list):
      sum += item
      previous[sum] = last_idx
      first_idx = previous.get(sum - k)

      if first_idx is not None:
        return list[first_idx + 1:last_idx + 1]


print(Solution().find_continuous_k([1, 3, 2, 5, 7, 2], 14))
