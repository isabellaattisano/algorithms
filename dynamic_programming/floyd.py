
def floyd(R):
# Input: the weight matrix W of a graph with no negative-length cycle
# Output: the distance matrix of the shortest paths' lengths 
# O(n^3)
    for vertex in range(len(R)):
        for i in range(len(R)):
            if(R[vertex][i] != -1):
                for col in range(len(R)):
                    if(R[col][vertex] != -1):
                        print(R[vertex][i], R[col][vertex])
                        if R[col][i] == -1:
                            R[col][i] = R[vertex][i] + R[col][vertex]
                        elif R[vertex][i] + R[col][vertex] <  R[col][i]:
                             R[col][i] = R[vertex][i] + R[col][vertex]

R = [[0,-1,3,-1],[2,0,-1,-1],[-1,7,0,1],[6,-1,-1,0]]
floyd(R)
print(R)

