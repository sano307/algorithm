class Solution:
    def isValid(self, s: str) -> bool:
        if not s: return True
        
        pairs = {
            "(": ")", "{": "}", "[": "]"
        }
        left = ["(", "{", "["]
        
        stack = []
        for c in s:
            if c in left:
                stack.append(c)
            elif stack and c == pairs[stack[-1]]:
                stack.pop()
            else:
                return False

        return stack == []
