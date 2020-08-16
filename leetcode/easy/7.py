class Solution:
    def reverse(self, x: int) -> int:
        if x == 0: return 0
    
        if x % 10 == 0:
            x = int(x / 10)
            
        if x > 0:
            answer = int(str(x)[::-1])
        else:
            answer = -int(str(abs(x))[::-1])
        
        if answer > (2 ** 31 - 1) or answer < -(2 ** 31):
            return 0

        return answer
