pocky, eating = map(int, input().split())

divide = int(pocky / (eating * 2))
remainder = pocky % (eating * 2)

if divide == 0:
    print(0)
elif remainder != 0:
    print(divide * eating)
else:
    print((divide - 1) * eating)
