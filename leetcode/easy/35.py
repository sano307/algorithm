class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        if target in nums:
            return nums.index(target)
        
        if nums[0] > target:
            return 0
        
        if nums[-1] < target:
            return len(nums)
        
        for num in nums:
            if target < num:
                return nums.index(num)
