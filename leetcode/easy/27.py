class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        if len(nums) == 0: return 0
        
        while True:
            try:
                nums.remove(val)
            except:
                break
        
        return len(nums)
