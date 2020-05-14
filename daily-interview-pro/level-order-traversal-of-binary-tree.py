"""
Given the root of a binary tree, print its level-order traversal.

Example:
  1
 / \
2   3
   / \
  4   5
The following tree should output 1, 2, 3, 4, 5.
"""
from Queue import Queue

class Node:
  def __init__(self, val, left=None, right=None):
    self.val = val
    self.left = left
    self.right = right


class Solution(object):
  def print_level_order(self, root):
    queue = Queue()
    queue.put(root)

    result = []
    while not queue.empty():
      node = queue.get()

      if node.left:
        queue.put(node.left)
    
      if node.right:
        queue.put(node.right)

      result.append(node.val)

    return " ".join(map(str, result))


root = Node(1, Node(2), Node(3, Node(4), Node(5)))
print Solution().print_level_order(root)
