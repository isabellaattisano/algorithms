package selection_sort;

public class selection{

    public static void main(String[] args){
        int arr1[] = {5,7,1,3,2,11, 0};
        int arr2[] = {5,2,5,2,-99,90,11,60};
        selectionSort(arr1);
        selectionSort(arr2);
        for(int i =0; i<arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println();
        for(int i =0; i<arr2.length; i++)
            System.out.print(arr2[i] + " ");
        System.out.println();

    }
    //Sorts a given array by selection sort
    //Input: An array arr[0..n − 1] of orderable elements 
    //Output: Array arr[0..n − 1] sorted in nondecreasing order
    public static void selectionSort(int arr[]){
        int min, p;
        for(int i =0; i<arr.length-1; i++){
            min = arr[i];
            for(int j =i+1; j<arr.length; j++)
                if(arr[j]<min){
                    //swap a[i] and a[j]
                    p = arr[i];
                    min = arr[j];
                    arr[i] = min;
                    arr[j] =p;
                }
        }
    }

}
