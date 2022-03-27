
# Sorts array A[0..n − 1] by recursive mergesort
# Input: An array A[0..n − 1] of orderable elements 
# Output: Array A[0..n − 1] sorted in nondecreasing order

def merge_sort(arr):
    if len(arr)>1:
        B = arr[0:int(len(arr)/2)]
        C = arr[int(len(arr)/2):len(arr)]
        merge_sort(B)
        merge_sort(C)
        merge(B,C,arr) #first would merge 8 and 3 arr = 3 8 than returns to previous call and merges 3 8 and 2 9 
                        #arr represents B and C because when you call merge sort they become arr so the arr from the merge func is returned as the result of merge_sort


#Merges two sorted arrays into one sorted array
#//Input: Arrays B[0..p − 1] and C[0..q − 1] both sorted
#Output: Sorted array A[0..p + q − 1] of the elements of B and C
def merge(B,C,A):
    i =0
    j=0
    k=0
    while i<len(B) and j<len(C):
        if B[i] <= C[j]:
            A[k] = B[i]
            i+=1
        else:
            A[k]=C[j]
            j+=1
        k+=1
    if i ==len(B):
        for ii in range(j,len(C)):  # B was added already so add C
            A[k]=C[ii]
            k+=1
    else:
       for ii in range(i,len(B)):
            A[k]=B[ii]
            k+=1 

ls = [8,3,2,9,7,1,5,4]
merge_sort(ls)
print(ls)