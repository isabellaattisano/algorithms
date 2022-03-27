#Implements nonrecursive binary search
#Input: An array A[0..n − 1] sorted in ascending order and 
# a search key K
#Output: An index of the array’s element that is equal to K 
# or −1 if there is no such element

def search(arr, K):
    l=0
    r = len(arr)-1
    while l <= r:
        m = int((l+r)/2)
        if K == arr[m]: return m
        elif K < arr[m]: r=m-1
        else: l = m+1
    return -1


arr = [3,7,12,16,23,27,33,40]
print(search(arr, 33))