# https://yukicoder.me/problems/no/45

n = int(input())
levels = list(map(int, input().split()))

max_sum = 0
if n == 1:
    max_sum = levels[0]
elif n == 2:
    max_sum = max(levels)
else:
    levels[2] += levels[0]
    for i in range(3, n):
        levels[i] += max(levels[:i-1])
    max_sum = max(levels)

print(max_sum)
