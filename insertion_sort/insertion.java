package insertion_sort;

public class insertion {
    public static void main(String[] args){
        int arr[] = {4,9,2,3,8,7,7,1,11};
        insertionSort(arr);
        for(int i =0; i<arr.length; i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }

    //Sorts a given array by insertion sort
    //Input: An array A[0..n − 1] of n orderable elements 
    //Output: Array A[0..n − 1] sorted in nondecreasing order
    static void insertionSort(int arr[]){
        int val, j;
        for(int i=1; i<arr.length; i++){ //consider arr[0] to be a presorted array to insert arr[1] into
            val = arr[i]; // value to insert
            j = i-1;
            while(j>=0 && arr[j]> val){  //goes through the presorted array while the val is still smaller than arr[j]
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
    }

}
