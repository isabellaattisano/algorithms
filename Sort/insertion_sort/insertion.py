
def insertion_sort(arr):
    for i in range(1, len(arr)):
        val = arr[i]  #i=2
        j = i-1         #j=1
        while j >=0 and arr[j] > val: 
            arr[j+1] = arr[j]  #move the bigger value into the +1 index
            arr[j] = val #move the smaller value into the -1 index
            j=j-1 #decrement and check if the value is still smaller 
        

arr = [4,9,2,3,8,7,7,1,11]
insertion_sort(arr)
print(arr)