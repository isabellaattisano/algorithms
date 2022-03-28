
pattern = "barber"
text = "jim saw me in a barbershop"
Table = [None] * 26

#create table 
def shift_table(pattern):
    for i in range(0,26):
        Table[i] = len(pattern)

    for j in range(0, len(pattern)-1):
        Table[ord(pattern[j])-97] = len(pattern)-1-j
    

#Implements Horspool’s algorithm for string matching
#Input: Pattern P [0..m − 1] and text T [0..n − 1]
#Output: The index of the left end of the first matching substring
def horspool(P, T):
    shift_table(P)
    m = len(P)
    n = len(T)
    i = m - 1 # position of rightmost character of pattern 
    while(i<=n-1):
        k = 0 #number of matched characters
        while(k<=m-1 and P[m-1-k]==T[i-k]):
            k+=1
        if k == m:
            return i -m +1
        else:
            if ord(T[i]) == 32:
                i+=m
            else:
                i = i + Table[ord(T[i])-97]  #shift 
    return -1

print(horspool(pattern,text))

