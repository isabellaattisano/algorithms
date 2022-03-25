#include <stdio.h>
#include <stdbool.h>

int sequential(int *arr, int val, int count){
    int i =0;
    while(i<count && arr[i]!=val)
        i++;
    if(i<count)
        return i;
    return -1;
}

int main(){
    int arr[] = {1,7,9,3,6,4};
    int ans = sequential(arr, 10, sizeof(arr)/sizeof(int));
    if(ans==-1){
         printf("Not Found\n");
    }
    else
        printf("index: %d\n", ans);
}