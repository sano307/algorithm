expectedBisket = int(input())

if expectedBisket == 1:
    print(0)
    exit()

base = 2
power = 1
while base < expectedBisket:
    base *= 2
    power += 1

print(power)
