
import java.util.*;

public class quickSelect{

    static int[] list = {4, 1, 10, 8, 7, 12, 9, 2, 15};

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter kth smallest element to find: ");
        int k = scan.nextInt();
        int ans = quick(k, 0, list.length);
        
        
    }

    static int quick(int k, int l, int r){
        int ret = lomuto(l, r);
        if(l>r) return 0;
        else if(k-1 == ret) {
        	int ans = list[ret];
            System.out.println(ans);
            return list[ret];
        }
        else if(k-1<ret){
            quick(k, l, ret);
        }
        else{
            quick(k, ret+1, r); 
        }
        return list[ret];
    }


    static int lomuto(int l, int r){
        int p = l;
        int s = l;
        for(int i = l+1; i<r; i++){
            if(list[i] < list[p])
            {
                s++;
                int temp = list[s];
                list[s] = list[i];
                list[i] = temp;
            }
        }
        int temp = list[s];
        list[s] = list[p];
        list[p] = temp;
        return s;
    }

} 