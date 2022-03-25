#uses a queue 

from collections import deque

class node: 
    def __init__(self, val):
        self.edges = []
        self.val = val
    def add_edge(self, node):
        self.edges.append(node)

def bfs(p):
    q = deque()
    q.append(p)
    visited = set()

    while len(q)!=0:
        n = q.popleft()
        visited.add(n.val)
        print(n.val)
        for i in n.edges:
            if(i.val not in visited):
                visited.add(i.val)
                q.append(i)


n1 = node("a")
n2 = node("c")
n3 = node("b")
n4 = node("d")
n5 = node("e")

n1.add_edge(n2)
n2.add_edge(n1)

n1.add_edge(n3)
n3.add_edge(n1)

n2.add_edge(n4)
n4.add_edge(n2)

n3.add_edge(n5)
n5.add_edge(n3)

bfs(n1)


