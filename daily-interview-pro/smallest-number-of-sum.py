"""
Given a sorted list of positive numbers, find the smallest positive number that cannot be a sum of any subset in the list.

Example:
Input: [1, 2, 3, 8, 9, 10]
Output: 7
"""
class Solution(object):
  def findSmallest(self, nums):
    res = 1

    for num in nums:
      if num <= res:
        res += num
      else:
        break

    return res


print Solution().findSmallest([1, 2, 3, 8, 9, 10])
