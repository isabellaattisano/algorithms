n = 4
W = [2,1,3,2]
V = [12,10,20,15]
C = 6
S = [[0 for c in range(C)] for r in range(len(W))]

for i in range(0, len(W)):
    for j in range(0, C):
        if W[i] <= j:
            S[i][j] = max(S[i-1][j], V[i]+S[i-1][j-W[i]])

print(S)