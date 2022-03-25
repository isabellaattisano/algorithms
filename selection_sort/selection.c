#include<stdio.h>

//Sorts a given array by selection sort
//Input: An array arr[0..n − 1] of orderable elements 
//Output: Array arr[0..n − 1] sorted in nondecreasing order

void selectionSort(int *arr, int len){
    int min, p;
    for(int i =0; i<len-1; i++){
        min = arr[i];
        for(int j =i+1; j<len; j++){
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

int main(){
    int array[7] = {5,7,1,3,2,11, 0};
    int array2[8] = {5,2,5,2,11,-11,11,60};

    selectionSort(&array, sizeof(array)/sizeof(int));
    selectionSort(&array2, sizeof(array2)/sizeof(int));

     for(int i =0; i<sizeof(array)/sizeof(int); i++){
         printf("%d ", array[i]);
     }
      printf("\n");
     for(int i =0; i<sizeof(array2)/sizeof(int); i++){
         printf("%d ", array2[i]);
     }
     printf("\n");

}