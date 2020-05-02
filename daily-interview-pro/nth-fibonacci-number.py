"""
The Fibonacci sequence is the integer sequence defined by the recurrence relation: F(n) = F(n-1) + F(n-2), where F(0) = 0 and F(1) = 1.
In other words, the nth Fibonacci number is the sum of the prior two Fibonacci numbers.
Below are the first few values of the sequence:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...

Given a number n, print the n-th Fibonacci Number.

Examples:
Input: n = 9
Output: 34
"""
class Solution():
  def fibonacci(self, n):
    before = 0
    after = 1

    if (n == 0): return before
    if (n == 1): return after

    for i in range(n+1):
        if (i == 0 or i == 1): continue

        temp = after
        after = before + after
        before = temp
    
    return after


print(Solution().fibonacci(9))
