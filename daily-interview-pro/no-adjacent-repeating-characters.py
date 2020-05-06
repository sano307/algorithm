"""
Given a string, rearrange the string so that no character next to each other are the same.
If no such arrangement is possible, then return None.

Example:
Input: abbccc
Output: cbcbca
"""
import heapq

class Solution(object):
  def rearrangeString(self, s):
    frequency = dict()
    for alphabet in s:
      frequency[alphabet] = frequency.get(alphabet, 0) + 1

    # Take the most frequent character.
    most_freq = []
    for char, count in frequency.items():
      heapq.heappush(most_freq, (-count, char))

    curr_char = heapq.heappop(most_freq)
    final = [curr_char[1]]

    # Repeat the same process for excluding the last character added.
    while most_freq:
      new_char = heapq.heappop(most_freq)
      # Place it as the next character.
      final.append(new_char[1])

      # Subtract that character's frequency by 1.
      if -curr_char[0] > 1:
        heapq.heappush(most_freq, (curr_char[0] + 1, curr_char[1]))
      curr_char = new_char

    if -curr_char[0] > 1:
      return None

    return "".join(final)


print Solution().rearrangeString('abbccc')
