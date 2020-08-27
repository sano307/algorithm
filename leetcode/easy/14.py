class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0: return ""
        
        answer = ""
        for i in range(len(min(strs))):
            target = strs[0][i]
            
            if all(s[i] == target for s in strs):
                answer += target
            else:
                break
                
        return answer
