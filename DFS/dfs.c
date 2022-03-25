#include <stdio.h>
#include <stdlib.h>

#define MAX (100)

typedef struct node node;
struct node{
    char val;
    node *edges[MAX];
    int edge_count;
    int visited;
};

void dfs(node *n){
    printf("%c\n", n->val);
    for(int i =0; i<n->edge_count; i++){
        if(n->edges[i]->visited==0){
            n->edges[i]->visited=1;
            dfs(n->edges[i]);
        }
    }
}

int main(){
    node n1, n2, n3, n4, n5;
    n1.val = 'a'; n2.val = 'c'; n3.val = 'b'; n4.val='d'; n5.val='e';
    n1.edge_count = 0; n2.edge_count=0; n3.edge_count=0; n4.edge_count=0; n5.edge_count=0;
    n1.visited = 0; n2.visited=0; n3.visited=0; n4.visited=0; n5.visited=0;
    n1.edges[0] = &n2; n2.edges[0] = &n1;  n1.edge_count++; n2.edge_count++; 
 
    n1.edges[1] = &n3; n3.edges[0] = &n1;  n1.edge_count++; n3.edge_count++; 
    n2.edges[1] = &n4; n4.edges[0] = &n2;  n2.edge_count++; n4.edge_count++; 
    n3.edges[1] = &n5; n5.edges[0] = &n3;  n3.edge_count++; n5.edge_count++; 

    n1.visited=1;
    dfs(&n1);

}