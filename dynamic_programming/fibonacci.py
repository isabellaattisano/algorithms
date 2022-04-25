FA = [0, 1]
n = 4

for i in range(2, n+1):
    FA.append(FA[i-1] + FA[i-2])

print(FA[4])