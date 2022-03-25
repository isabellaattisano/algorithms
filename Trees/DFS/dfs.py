class node: 
    visited = 0
    def __init__(self, val):
        self.edges = []
        self.val = val
    def add_edge(self, node):
        self.edges.append(node)

#uses recursive stack 
def dfs(n):
    print(n.val)
    for i in n.edges:
        if(i.visited == 0):
            i.visited = 1
            dfs(i)


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

n1.visited=1
dfs(n1)

