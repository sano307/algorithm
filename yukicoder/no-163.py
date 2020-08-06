password = list(input())

answer = ""
for s in password:
    if (s.isupper()):
        answer += s.lower()
    else:
        answer += s.upper()

print(answer)
