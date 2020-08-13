k, n, f = map(int, input().split())
ages = list(map(int, input().split()))

total = k * n

for age in ages:
    total -= age

if (total < 0):
    print(-1)
else:
    print(total)