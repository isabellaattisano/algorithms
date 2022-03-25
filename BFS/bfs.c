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


typedef struct queue queue;
struct queue{
    node *items[MAX];
    int length;
    int front;
    int rear;
};

queue* createQueue();
void enqueue(queue* q, node* n);
node* dequeue(queue* q); 
int isEmpty(queue* q);
int isFull(queue* q);

void bfs(node *n){
    
    queue *q = createQueue();
    enqueue(q, n);
    n->visited=1;

    while(!isEmpty(q)){
        node *p = dequeue(q);
        p->visited=1;
        printf("%c\n", p->val);
        for(int i =0; i<p->edge_count;i++){
            if(p->edges[i]->visited==0){
                enqueue(q, p->edges[i]);
                p->edges[i]->visited=1;
            }
        }

    }

}

int main(){
    node n1, n2, n3, n4, n5;
    n1.val = 'a'; n2.val = 'b'; n3.val = 'c'; n4.val='d'; n5.val='e';
    n1.edge_count = 0; n2.edge_count=0; n3.edge_count=0; n4.edge_count=0; n5.edge_count=0;
    n1.visited = 0; n2.visited=0; n3.visited=0; n4.visited=0; n5.visited=0;
    n1.edges[0] = &n2; n2.edges[0] = &n1;  n1.edge_count++; n2.edge_count++; 
 
    n1.edges[1] = &n3; n3.edges[0] = &n1;  n1.edge_count++; n3.edge_count++; 
    n2.edges[1] = &n4; n4.edges[0] = &n2;  n2.edge_count++; n4.edge_count++; 
    n3.edges[1] = &n5; n5.edges[0] = &n3;  n3.edge_count++; n5.edge_count++; 

    bfs(&n1);

}

queue* createQueue(){
    queue* q = malloc(sizeof(struct queue));
    q->front=-1; q->rear=-1;
    q->length =0;
    return q;
}

void enqueue(queue* q, node* n){
   if(isFull(q)){
       printf("200");
        return;
   }
    if(isEmpty(q)){
        q->front=0;
    }
    q->rear=(q->rear+1)%MAX;
    q->items[q->rear]=n;
    q->length++;    
}

node* dequeue(queue* q){
    if(isEmpty(q))
        return NULL;

    node *temp = q->items[q->front];
    if(q->front == q->rear)
    {
        q->front=-1;
        q->rear=-1;
        q->length=0;
    }
    else{
        q->front=(q->front+1)%MAX;
        q->length--;  
    }
     return temp;  
}

int isEmpty(queue *q){
    if(q->length==0)
        return 1;
    else
        return 0;
}

int isFull(queue *q){
    if(q->length==MAX-1)
        return 1;
    else
        return 0;
}