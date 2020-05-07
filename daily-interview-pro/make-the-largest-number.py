"""
Given a number of integers, combine them so it would create the largest number.

Example:
Input:  [17, 7, 2, 45, 72]
Output:  77245217
"""
from functools import cmp_to_key

class Solution(object):
  def largestNum(self, nums):
    str_nums = [
      str(n) for n in sorted(nums, key=cmp_to_key(
        lambda a, b:
          1 if str(a) + str(b) < str(b) + str(a) else -1
      ))]
    
    return "".join(str_nums)


print Solution().largestNum([17, 7, 2, 45, 72])
