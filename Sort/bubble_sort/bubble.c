#include <stdio.h> 

//Sorts a given array by bubble sort
//Input: An array arr[0..n − 1] of orderable elements 
//Output: Array arr[0..n − 1] sorted in nondecreasing order
void bubbleSort(int *arr, int len){
    int x = arr[0], y=arr[0];
    for(int i =0; i<len-1; i++){
        for(int j =0; j<len-1-i; j++){
            if(arr[j+1] < arr[j]){
                    x = arr[j+1];
                    y = arr[j];
                    arr[j+1] = y;
                    arr[j] = x;
                }
        }
    }

}

int main(){
    int arr[] = {5,7,1,3,2,11, 0};
    int arr2[] = {5,2,5,2,-99,90,11,60};
    bubbleSort(&arr, sizeof(arr)/sizeof(int));
    bubbleSort(&arr2, sizeof(arr2)/sizeof(int));

    for(int i =0; i<sizeof(arr)/sizeof(int); i++){
         printf("%d ", arr[i]);
     }
      printf("\n");
     for(int i =0; i<sizeof(arr2)/sizeof(int); i++){
         printf("%d ", arr2[i]);
     }
     printf("\n");
}