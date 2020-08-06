count = int(input())
numbers = sorted(map(int, input().split(" ")))

answer = 0
target = count // 2
if count % 2 == 0:
    pick = int(numbers[target - 1]) + int(numbers[target])
else:
    pick = int(numbers[target]) * 2

answer = pick / (2 * 1.0)
print(answer)
