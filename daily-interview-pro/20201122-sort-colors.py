from enum import Enum
class Color(Enum):
    RED =  0
    WHITE = 1
    BLUE = 2

class Solution:
    targets = [
        Color.RED.value,
        Color.WHITE.value,
        Color.BLUE.value
    ]

    def sortColors(self, nums):
        colors = {}

        for num in nums:
            assert num in self.targets
            if num in colors:
                colors[num] += 1
            else:
                colors[num] = 1

        idx = 0
        for i in range(colors[0]):
            nums[idx] = 0
            idx += 1
        for i in range(colors[1]):
            nums[idx] = 1
            idx += 1
        for i in range(colors[2]):
            nums[idx] = 2
            idx += 1

nums = [0, 1, 2, 2, 1, 1, 2, 2, 0, 0, 0, 0, 2, 1]
Solution().sortColors(nums)
assert nums == [0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2]
