class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        reverses = {}
        
        for i, num in enumerate(nums):
            expect = target - num
            
            if expect not in reverses:
                reverses[num] = i
            else:
                return [reverses[expect], i]
