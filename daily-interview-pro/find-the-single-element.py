"""
Given an array of integers, arr, where all numbers occur twice except one number which occurs once, find the number.
Your solution should ideally be O(n) time and use constant extra space.

Example:
Input: arr = [1, 1, 3, 4, 4, 5, 6, 5, 6]
Output: 3
"""
class Solution(object):
  def findSingle(self, nums):
    target = 0

    for num in nums:
        target ^= num

    return target


nums = [1, 1, 3, 4, 4, 5, 6, 5, 6]
print(Solution().findSingle(nums))
