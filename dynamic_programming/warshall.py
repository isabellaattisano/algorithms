
def warshall(R):
# Input: the adjacency matrix A of a digraph with n vertices
# Output: the transitive closure of the digraph 
# O(n^3)
    for vertex in range(len(R)):
        for i in range(len(R)):
            if(R[vertex][i] == 1):
                for col in range(len(R)):
                    if(R[col][vertex] == 1):
                        R[col][i] = 1

R = [[0,0,1,0],[1,0,0,1],[0,0,0,0],[0,1,0,0]]
warshall(R)
print(R)

