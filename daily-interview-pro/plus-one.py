"""
Given a non-empty array where each element represents a digit of a non-negative integer, add one to the integer.
The most significant digit is at the front of the array and each element in the array contains only one digit.
Furthermore, the integer does not have leading zeros, except in the case of the number '0'.

Example:
Input: [2,3,4]
Output: [2,3,5]
"""
class Solution(object):
  def plusOne(self, digits):
    num = 0

    for i in range(len(digits)):
      num = num*10 + digits[i]
    
    return [int(i) for i in str(num+1)]


print Solution().plusOne([2,3,4])
