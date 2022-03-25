#include <stdio.h>
void insertionSort(int *arr, int len){
    int val, j;
        for(int i=1; i<len; i++){ //consider arr[0] to be a presorted array to insert arr[1] into
            val = arr[i]; // value to insert
            j = i-1;
            while(j>=0 && arr[j]> val){  //goes through the presorted array while the val is still smaller than arr[j]
                arr[j+1] = arr[j];
                arr[j] = val;
                j--;
            }
        }
    }

int main(){
    int arr[] = {4,9,2,3,8,7,7,1,11};
    insertionSort(arr, sizeof(arr)/sizeof(arr[0]));
    for(int i =0; i<sizeof(arr)/sizeof(int); i++){
         printf("%d ", arr[i]);
     }
    printf("\n");
}