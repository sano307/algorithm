import math

x = int(input())
y = int(input())
l = int(input())

execution_count = 0

if x != 0:
    execution_count += 1
    execution_count += math.ceil(abs(x) / l)

if y < 0:
    if x != 0:
        execution_count += 1
    else:
        execution_count += 2

if y != 0:
    execution_count += math.ceil(abs(y) / l)

print(execution_count)
