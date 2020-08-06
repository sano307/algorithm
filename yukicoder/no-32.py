l = int(input()) # 100 yen
m = int(input()) # 25 yen
n = int(input()) # 1 yen

m += n // 25
l += m // 4

answer = (n % 25) + (m % 4) + (l % 10)
print(answer)
