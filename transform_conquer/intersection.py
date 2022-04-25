
def brute_force(set1, set2):
    ans = []
    for i in range(len(set1)):
        for j in range(len(set2)):
            if set1[i] == set2[j]:
                ans.append(set2[j])
    print(ans)

def transform_conquer(set1, set2):
    set1.sort()
    set2.sort()
    ans = []

    i = 0
    j = 0

    while i < len(set1) and j < len(set2):
        if set1[i] == set2[j]:
            ans.append(set1[i])
            j+=1
            i+=1
        elif(set1[i] < set2[j]):
            i+=1
        elif(set1[i] > set2[j]):
            j+=1
    print("transform & conquer", ans)


set1 = [6,8,3,4,2,10]
set2 = [7,10,12,13,3]
transform_conquer(set1, set2)
