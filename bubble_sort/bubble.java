package bubble_sort;

public class bubble {
    public static void main(String[] args){
        int arr1[] = {5,7,1,3,2,11, 0};
        int arr2[] = {5,2,5,2,-99,90,11,60};
        bubbleSort(arr1);
        bubbleSort(arr2);
        for(int i =0; i<arr1.length; i++)
            System.out.print(arr1[i] + " ");
        System.out.println();
        for(int i =0; i<arr2.length; i++)
            System.out.print(arr2[i] + " ");
        System.out.println();
    }
    
    //Sorts a given array by bubble sort
    //Input: An array arr[0..n − 1] of orderable elements 
    //Output: Array arr[0..n − 1] sorted in nondecreasing order
    static void bubbleSort(int arr[]){
        int x = arr[0], y = arr[0];
        for(int i =0; i<arr.length-1; i++)
            for(int j =0; j<arr.length-1-i; j++)
                if(arr[j+1] < arr[j]){
                    x = arr[j+1];
                    y = arr[j];
                    arr[j+1] = y;
                    arr[j] = x;
                }
    }
}
