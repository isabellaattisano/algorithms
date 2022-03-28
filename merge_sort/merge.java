package merge_sort;
import java.util.*;

public class merge {
    public static void main(String[] args){
        List<Integer> ls = new ArrayList<Integer>();
        ls.add(6); ls.add(3); ls.add(2); ls.add(9);
        ls.add(7); ls.add(1); ls.add(5); ls.add(4);
        merge_sort(ls);
        for(int i =0; i<ls.size(); i++)
            System.out.println(ls.get(i));
    }

    static void merge_sort(List<Integer> ls){
        
        if(ls.size()>1){
        List<Integer> B = new ArrayList<>(); B = ls.subList(0, (ls.size()/2));
        List<Integer> C =  new ArrayList<>(); C = ls.subList((ls.size()/2), ls.size());
        merge_sort(B);
        merge_sort(C);
        merges(B, C, ls);
        }
    }

    static void merges(List<Integer> B, List<Integer> C, List<Integer> ls){
        int i =0, j=0, k=0;

        while(i<B.size() && j<C.size()){
            if(B.get(i)<C.get(j)){
                ls.set(k, B.get(i));
                i++;
            }
           else{
                ls.set(k, C.get(j));
                j++;
           }
           k++;
        }
        if(i==B.size()){
            for(int ii =j; ii<C.size(); ii++)
            {
                ls.set(k, C.get(ii));
                k++;
            }
        }
        else{
            for(int ii =i; ii<B.size(); ii++)
            {
                ls.set(k, C.get(ii));
                k++;
            }
        }
    }
}
