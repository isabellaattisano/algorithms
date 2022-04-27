def partition(A, l, r):
    i =l
    j = r+1
    p = A[l]
    while(i<j):
        i+=1
        j-=1
        while(A[i]<p):
            i+=1
        while(A[j]>p):
            j-=1
        swap(A, i, j)
    swap(A, i, j)
    swap(A, l, j)
    return j

def swap(A, l, j):
    temp = A[l]
    A[l] = A[j]
    A[j] = temp

def quickSort(A, l, r):
    if(l>=r):
        return 
    p = partition(A, l, r)
    quickSort(A, p+1, r)
    quickSort(A, l, p-1)

A = [5,3,1,9,8,2,5,7]
quickSort(A, 0, len(A)-1)
print(A)