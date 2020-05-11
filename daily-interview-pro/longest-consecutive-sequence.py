"""
You are given an array of integers.
Return the length of the longest consecutive elements sequence in the array.

Example:
Input: [100, 4, 200, 1, 3, 2]
Output: 4
"""
class Solution(object):
  def longest_consecutive(self, nums):
    max_len = 0
    bounds = dict()
  
    for num in nums:
      if num in bounds:
        continue
    
      left_bound, right_bound = num, num
    
      if num - 1 in bounds:
        left_bound = bounds[num - 1][0]
      if num + 1 in bounds:
        right_bound = bounds[num + 1][1]
    
      bounds[num] = left_bound, right_bound
      print(bounds[num])
      bounds[left_bound] = left_bound, right_bound
      print(bounds[left_bound])
      bounds[right_bound] = left_bound, right_bound
      print(bounds[right_bound])
      max_len = max(right_bound - left_bound + 1, max_len)
  
    return max_len


print Solution().longest_consecutive([100, 4, 200, 1, 3, 2])
