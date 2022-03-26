package topological_sort;
import java.util.*;

public class topological {
    static ArrayList<node> stack = new ArrayList<>();
    static boolean DAG = true;

    public static void main(String[] args){
        System.out.println();
        node n1 = new node('a'), n2= new node('b'), n3 = new node('c'), n4 = new node('d'), n5 = new node('e');
        n1.edges.add(n2);
        n1.edges.add(n4);
        n2.edges.add(n3);
        n2.edges.add(n1);
       
        topSort(n1);
        if(DAG){
            for(int i =0; i<stack.size(); i++)
                System.out.println(stack.get(i).val);
        }
    }

    static void topSort(node n){
        stack.add(n);
        for(int i =0; i<n.edges.size(); i++){
            if(stack.contains(n.edges.get(i))){ //check for back edge
                System.out.println("Not a DAG");
                DAG = false;
                return;
            }
            else if(n.edges.get(i).visited==0){
                n.edges.get(i).visited=1;
                topSort(n.edges.get(i));
            }
        }
    }
    

}

class node{
    ArrayList<node> edges = new ArrayList<>();
    char val;
    int visited;

    node(char val){
        this.val = val;
        this.visited = 0;
    }
}