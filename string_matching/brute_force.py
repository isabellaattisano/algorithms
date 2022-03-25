
# implements a brute-force string matching
# input: an array T[0...n-1] of n characters representing a text 
# input: an array P[0..m-1] of m characters representing a pattern 
# output: the index of the first character in the text that starts a matching substring 
#          -1 if fails 

def find_match(text, pattern):
    for i in range(0, len(text)-len(pattern)):
        j = 0
        while j<len(pattern) and pattern[j] == text[i+j]:
            j = j+1
        if j==len(pattern): 
            return i
    return -1


text = "noboy noticed him"
pattern = "not"
print(find_match(text, pattern))


