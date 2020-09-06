def one_bits(num):
    count = 0
    while num > 0:
        if num & 1 == 1:
            count += 1
        num >>= 1 # 10111 -> 1011 -> 101 -> 10 -> 1 -> 0

    return count

print(one_bits(23)) # 4
