# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:

        head = ListNode(0)
        tail = head
        
        while True:
            if l1 is None and l2 is None:
                break
            elif l1 is None:
                tail.next = l2
                break
            elif l2 is None:
                tail.next = l1
                break
            else:
                if l1.val >= l2.val:
                    tail.next = ListNode(l2.val)
                    l2 = l2.next
                else:
                    tail.next = ListNode(l1.val)
                    l1 = l1.next
            
                tail = tail.next

        return head.next
