
def bubble_sort(x):
    for i in range(0, len(x)-1):
        for j in range(0, len(x)-1-i):
            if x[j+1] < x[j]:
                z = x[j+1]
                y = x[j]
                x[j+1] = y
                x[j] = z


x = [5,7,1,3,2,11, 0]
bubble_sort(x)
for i in x:
    print(i)