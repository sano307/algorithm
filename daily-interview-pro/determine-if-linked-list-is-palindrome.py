"""
You are given a doubly linked list. Determine if it is a palindrome.

Can you do this for a singly linked list?
"""
class Node(object):
  def __init__(self, val):
    self.val = val
    self.next = None
    self.prev = None


class Solution(object):
  def is_palindrome(self, node):
    tail = node

    while tail.next:
      tail = tail.next

    while node != tail:
      if node.val != tail.val:
        return False
    
      node = node.next
      tail = tail.prev
  
    return True


node = Node('a')
node.next = Node('b')
node.next.prev = node
node.next.next = Node('b')
node.next.next.prev = node.next
node.next.next.next = Node('a')
node.next.next.next.prev = node.next.next

print Solution().is_palindrome(node)
