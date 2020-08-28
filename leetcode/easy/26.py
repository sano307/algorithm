class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0: return 0

        before = nums[0]
        for num in nums[1::]:
            if num == before:
                nums.remove(num)

            before = num
        
        return len(nums)
