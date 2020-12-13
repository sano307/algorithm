class Queue:
    def __init__(self):
        self.s1 = []
        self.s2 = []

    # O(1)
    def enqueue(self, val) -> None:
        self.s1.append(val)

    # O(N)
    def dequeue(self) -> int:
        if self.s2:
            return self.s2.pop()
        
        if self.s1:
            while self.s1:
                self.s2.append(self.s1.pop())
            return self.s2.pop()
        return None


q = Queue()
q.enqueue(1)
q.enqueue(2)
q.enqueue(3)

assert q.dequeue() == 1
assert q.dequeue() == 2
assert q.dequeue() == 3
