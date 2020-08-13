price, consumptionTax = map(int, input().split())

answer = int(price + (price * consumptionTax / 100))
print(answer)