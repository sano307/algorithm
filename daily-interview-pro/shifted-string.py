"""
You are given two strings, A and B.
Return whether A can be shifted some number of times to get B.

Eg. A = abcde, B = cdeab should return true because A can be shifted 3 times to the right to get B.
A = abc and B= acb should return false.
"""
class Solution(object):
  def is_shifted(self, a, b):
    if len(a) != len(b):
      return False

    return b in a + a


print Solution().is_shifted('abcde', 'cdeab')
print Solution().is_shifted('abc', 'acb')
