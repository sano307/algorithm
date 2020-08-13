width = int(input())
count = int(input())
boxes = sorted(list(map(int, input().split())))

answer = 0
for box in boxes:
    width -= box

    if (width < 0):
        break
    
    answer += 1

print(answer)