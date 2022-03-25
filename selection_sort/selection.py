
#Sorts a given array by selection sort
#Input: An array arr[0..n − 1] of orderable elements 
#Output: Array arr[0..n − 1] sorted in nondecreasing order
def selection_sort(x):
    for i in range(0, len(x)-1):
        min = x[i]
        for j in range(i+1, len(x)):
            if x[j] < min:
                p = x[i]
                min = x[j]
                x[i] = min
                x[j] =p

x = [5,7,1,3,2,11, 0]
selection_sort(x)
for i in x:
    print(i)