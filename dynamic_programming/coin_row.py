C = [5,1,2,10,6,2]
S = [0, C[0]]

for i in range(2, len(C)+1):
    m = max(S[i-1], S[i-2]+C[i-1])
    S.append(m)

print(S[len(S)-1])